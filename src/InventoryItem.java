public class InventoryItem {
    // fields
    Book book;
    private int quantity;

    // constructor
    public InventoryItem(Book book, int quantity) {
        this.book = book;
        setQuantity(quantity);
    }

    // getters & setters
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        // handle stockable books
        if (book instanceof IStockable stockable) {
            // handle invalid quantities
            if (quantity < 0)
                throw new IllegalArgumentException("Error during inventory item creation: quantity cannot be negative");

            this.quantity = quantity;
            return;
        }

        // handle non-stockable books
        this.quantity = 0;
    }

    public void increaseQuantity(int amount) {
        setQuantity(getQuantity() + amount);
    }

    public void reduceQuantity(int amount) {
        setQuantity(getQuantity() - amount);
    }

    public boolean isAvailable(int quantity) { return this.quantity >= quantity; }

    @Override
    public String toString() {
        return book + ", quantity: " + quantity;
    }
}