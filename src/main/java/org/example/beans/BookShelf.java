package org.example.beans;

import javax.persistence.*;

@Entity
public class BookShelf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "bookShelf")
    private Book book;

    public void useLibraryMethod() {
        if (book != null) {
            book.getLibrary().someLibraryMethod();
        }
    }

    // getters, setters, toString
}
