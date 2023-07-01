# Library
- 스프링 부트 연습용 데모
  - 멀티모듈로 구성 예정
    - presentation-rest : 실행가능한 어플리케이션 구성과 요청응답처리 with API
    - application : 트랜잭선 단위로 기능을 수행
    - domain-*** : 해당 도메인 관련 엔티티, 서비스, 레포지토리 인터페이스. 핵심적인 비즈니스 로직도 수행.
    - infrastructure : 데이터베이스 등 기술 지원
