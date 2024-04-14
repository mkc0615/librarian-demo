package com.demo.presentationrest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class TimeTrackAspect {
    @Pointcut("@annotation(com.demo.presentationrest.aop.TimeTrack)")
    private void timeTrackPointCut() {
    }

    @Around("timeTrackPointCut")
    public Object timeTrack(ProceedingJoinPoint joinPoint) throws Throwable {

        StopWatch stopWatch = new StopWatch();

        try {
            stopWatch.start();
            return joinPoint.proceed();
        } finally {
            stopWatch.stop();
            System.out.println("for " + joinPoint.getSignature().toShortString() +" took "+ stopWatch.getTotalTimeSeconds());
        }
    }
}
