package com.mosia.javaee;

import com.mosia.javaee.model.Book;
import com.mosia.javaee.qualifier.ThirteenDigits;
import com.mosia.javaee.service.NumberGenerator;
import jakarta.inject.Inject;

public class BookService {

    @ThirteenDigits
    private NumberGenerator numberGenerator;

    @Inject
    public BookService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}