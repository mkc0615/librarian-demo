package com.demo.infrastructure.checkout;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCheckoutEntity is a Querydsl query type for CheckoutEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCheckoutEntity extends EntityPathBase<CheckoutEntity> {

    private static final long serialVersionUID = 1077101764L;

    public static final QCheckoutEntity checkoutEntity = new QCheckoutEntity("checkoutEntity");

    public final NumberPath<Long> bookId = createNumber("bookId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> checkoutDate = createDateTime("checkoutDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> returnDate = createDateTime("returnDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QCheckoutEntity(String variable) {
        super(CheckoutEntity.class, forVariable(variable));
    }

    public QCheckoutEntity(Path<? extends CheckoutEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCheckoutEntity(PathMetadata metadata) {
        super(CheckoutEntity.class, metadata);
    }

}

