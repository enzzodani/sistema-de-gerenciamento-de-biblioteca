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
    private boolean availability;

//    Constructor
    public Book(String title, String author, String isbn, boolean availability, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = availability;
        this.year = year;
    }

//    Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
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
