package org.example.beans;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "library", fetch = FetchType.LAZY)
    private BookShelf bookShelf;

    public Library() {
    }

    public void someLibraryMethod() {
        // Реалізація вашого методу
    }

    // getters, setters, toString
}
