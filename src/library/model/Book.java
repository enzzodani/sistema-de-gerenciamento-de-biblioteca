package library.model;

public class Book {
//    Attributes
    private final String title;
    private final String author;
    private final String isbn;
    private final boolean availability;

    public Book(String title, String author, String isbn, boolean availability) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = availability;
    }
}
