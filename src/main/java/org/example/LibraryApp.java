package org.example;

import org.example.beans.Library;
import org.example.beans.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {
        // Створення екземпляра книги
        Book myBook = new Book();
        myBook.setName("The Great Gatsby");
        myBook.setAuthor("F. Scott Fitzgerald");

        // Створення контексту за допомогою конфігураційного класу AppConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Отримання біна Library через контекст
        Library library = context.getBean(Library.class);

        // Виклик методу бібліотеки, на який впливає аспект
        library.someLibraryMethod();

        // Виведення результату
        System.out.println(library);
    }
}
