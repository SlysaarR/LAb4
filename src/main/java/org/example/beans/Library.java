package org.example.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Library {
    private BookShelf bookShelf;

    @Autowired
    public Library(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    public void someLibraryMethod() {
        // Реалізація вашого методу
    }

    // getters, toString
}
