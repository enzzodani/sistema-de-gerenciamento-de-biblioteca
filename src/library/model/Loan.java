package library.model;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private User user;
    private LocalDate startDate;
    private LocalDate dueDate;

    public Loan(Book book, User user, LocalDate startDate, LocalDate dueDate) {
        this.book = book;
        this.user = user;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }
}
