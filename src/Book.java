import java.time.LocalDate;

public abstract class Book {
    // fields
    private String isbn;
    private String title;
    private LocalDate year;

    // constructor
    public Book(String isbn, String title, LocalDate year) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
    }

    // getters & setters
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public LocalDate getYear() { return year; }
    public void setYear(LocalDate year) { this.year = year; }

    @Override
    public String toString() {
        return "isbn: " + isbn + ", title: " + title + ", year: " + year;
    }
}
