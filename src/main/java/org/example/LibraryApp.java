package org.example;

import org.example.beans.Library;
import org.example.beans.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

        // Додавання книги до бази даних через JDBC
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "Slysar", "123654qwaszx")) {
            String insertQuery = "INSERT INTO books (book_name, author, library_id) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, myBook.getName());
                preparedStatement.setString(2, myBook.getAuthor());
                // Встановлюємо library_id (вам слід вказати конкретне значення або взяти його з вашого додатку)
                preparedStatement.setInt(3, 1);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Виведення результату
        System.out.println(library);
    }
}