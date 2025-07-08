import java.time.LocalDate;

public class PaperBook extends Book implements IStockable, IShippable, ISellable {
    // fields
    private double price;

    // constructor
    public PaperBook(String isbn, String title, LocalDate year, double price) {
        super(isbn, title, year);
        setPrice(price);
    }

    // getters & setters
    @Override
    public double getPrice() { return price; }

    @Override
    public void setPrice(double price) {
        if (price <= 0)
            throw new IllegalArgumentException("Error during book creation: price must be greater than 0 " + this);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " price: " + price + " PAPER";

    }
}
