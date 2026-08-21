package com.mosia.javaee;

import com.mosia.javaee.model.Book;
import com.mosia.javaee.qualifier.EightDigits;
import com.mosia.javaee.service.NumberGenerator;
import jakarta.inject.Inject;

public class LegacyBookService {

    @Inject
    @EightDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}