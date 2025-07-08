import java.time.LocalDate;

public class DemoBook extends Book {
    // constructor
    public DemoBook(String isbn, String title, LocalDate year) {
        super(isbn, title, year);
    }

    @Override
    public String toString() {
        return super.toString() + " DEMO";
    }
}
