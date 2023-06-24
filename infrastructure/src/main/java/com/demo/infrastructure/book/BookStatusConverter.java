package com.demo.infrastructure.book;

import com.demo.domaincore.model.BookStatus;
import jakarta.persistence.AttributeConverter;

public class BookStatusConverter implements AttributeConverter<BookStatus, String> {

    @Override
    public String convertToDatabaseColumn(BookStatus attribute) {
        return attribute != null ? attribute.name() : "";
    }

    @Override
    public BookStatus convertToEntityAttribute(String dbData) {
        return BookStatus.valueOf(dbData);
    }
}
