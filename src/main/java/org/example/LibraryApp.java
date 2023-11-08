package org.example;
import org.example.beans.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Library library = context.getBean(Library.class);
        System.out.println(library);
    }
}
