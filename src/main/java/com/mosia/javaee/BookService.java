package com.mosia.javaee;

import com.mosia.javaee.events.Added;
import com.mosia.javaee.events.Removed;
import com.mosia.javaee.model.Book;
import com.mosia.javaee.qualifier.ThirteenDigits;
import com.mosia.javaee.service.NumberGenerator;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

public class BookService {

    @ThirteenDigits
    private NumberGenerator numberGenerator;


    @Inject
    @Added
    private Event<Book> bookAddedEvent;

    @Inject
    @Removed
    private Event<Book> bookRemovedEvent;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        bookAddedEvent.fire(book);
        return book;
    }

    public void deleteBook(Book book) {
        bookRemovedEvent.fire(book);
    }
}