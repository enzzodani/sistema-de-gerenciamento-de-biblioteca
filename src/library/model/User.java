package library.model;

import java.time.LocalDate;
import java.util.List;

public class User {
//    Attributes
    private String name;
    private int id;

    private List<Book> borrowedBooks;

//    Constructor
    public User(String name, int id, List<Book> borrowedBooks) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = borrowedBooks;
    }
//    Methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
//    Loan Method
    public void borrowBook (Book book, LocalDate dueDate) {
//        Create a Loan Object
        Loan loan = new Loan(book, this, LocalDate.now(), dueDate);

//        Add book to list
        borrowedBooks.add(book);
    }
}
