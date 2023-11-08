package org.example.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class BookShelf {
    @Autowired
    private Book book;

    // getters, toString
}
