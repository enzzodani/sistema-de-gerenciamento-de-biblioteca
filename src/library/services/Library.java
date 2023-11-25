package library.services;

import library.model.*;

import java.time.LocalDate;
import java.util.List;

public class Library {
    private final List<User> userList;
    private final List<Book> bookList;
    private final List<Loan> loanList;

    public Library(List<User> userList, List<Book> bookList, List<Loan> loanList) {
        this.userList = userList;
        this.bookList = bookList;
        this.loanList = loanList;
    }
//    Methods
    public void addUser (User user) {
        userList.add(user);
    }
    public void addBook(Book book) {
        bookList.add(book);
    }
    public void borrowBook(User user, Book book, LocalDate dueDate) {
        user.borrowBook(book, dueDate);
        Loan loan = new Loan(book, user, LocalDate.now(), dueDate);
        loanList.add(loan);
    }
}
