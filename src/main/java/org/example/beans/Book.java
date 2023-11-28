package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired; // Додайте цей імпорт
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    private String name;
    private String author;

    // Порожній конструктор для Spring
    public Book() {
    }

    // Конструктор, який приймає параметри для ініціалізації полів
    @Autowired
    public Book(@Value("${book.name}") String name, @Value("${book.author}") String author) {
        this.name = name;
        this.author = author;
    }

    public void someLibraryMethod() {
        // Реалізація вашого методу
        System.out.println("Executing someLibraryMethod");
    }

    // getters, setters, toString

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
