package com.mosia.javaee.events;

import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import com.mosia.javaee.model.Book;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class InventoryService {

    @Inject
    private Logger logger;

    List<Book> inventory = new ArrayList<>();

    public void addBook(@Observes @Added Book book) {
        logger.warn("Adding book {} to inventory", book.getTitle());
        inventory.add(book);
    }

    public void removeBook(@Observes @Removed Book book) {
        logger.warn("Removing book {} to inventory", book.getTitle());
        inventory.remove(book);
    }
}