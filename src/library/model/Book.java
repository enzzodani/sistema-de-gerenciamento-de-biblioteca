package library.model;

import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
//    Attributes
    private final String title;
    private final String author;
    private final String isbn;
    private final int year;
    private final boolean availability;

    public Book(String title, String author, String isbn, boolean availability, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = availability;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "título='" + title + '\'' +
                ", autor='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", ano=" + year +
                ", disponibilidade=" + (availability ? "Disponível" : "Não disponível") + '}';
    }
}
