package com.demo.infrastructure.book;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBookEntity is a Querydsl query type for BookEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookEntity extends EntityPathBase<BookEntity> {

    private static final long serialVersionUID = -2136575580L;

    public static final QBookEntity bookEntity = new QBookEntity("bookEntity");

    public final StringPath author = createString("author");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> registeredAt = createDateTime("registeredAt", java.time.LocalDateTime.class);

    public final EnumPath<com.demo.domaincore.model.BookStatus> status = createEnum("status", com.demo.domaincore.model.BookStatus.class);

    public final StringPath title = createString("title");

    public QBookEntity(String variable) {
        super(BookEntity.class, forVariable(variable));
    }

    public QBookEntity(Path<? extends BookEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBookEntity(PathMetadata metadata) {
        super(BookEntity.class, metadata);
    }

}

