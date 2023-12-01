package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.beans.Book;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook() {
        Book newBook = new Book("New Book", "New Author");
        bookRepository.save(newBook);
    }

    public Book getBookById(Long bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    public void updateBook(Long bookId) {
        Book bookToUpdate = bookRepository.findById(bookId).orElse(null);
        if (bookToUpdate != null) {
            bookToUpdate.setName("Updated Book Name");
            bookToUpdate.setAuthor("Updated Author");
            bookRepository.save(bookToUpdate);
        }
    }

    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }
}
