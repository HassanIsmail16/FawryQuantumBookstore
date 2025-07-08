import java.time.LocalDate;

public class EBook extends Book implements IDigital, ISellable {
    // fields
    private String fileType;
    private double price;

    // constructor
    public EBook(String isbn, String title, LocalDate year, String fileType, double price) {
        super(isbn, title, year);
        setFileType(fileType);
        setPrice(price);
    }

    @Override
    public String getFileType() { return fileType; }

    @Override
    public void setFileType(String fileType) { this.fileType = fileType; }

    @Override
    public double getPrice() { return price; }

    @Override
    public void setPrice(double price) {
        if (price <= 0)
            throw new IllegalArgumentException("Error during book creation: price must be greater than 0" + this);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " fileType: " + fileType + " price: " + price + " EBOOK";
    }
}
