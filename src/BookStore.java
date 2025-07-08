import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private final BookInventory inventory = new BookInventory();

    public BookInventory getInventory() { return inventory; }

    public double purchase(String isbn, int quantity, String email, String address) {
        // validation
        if (!isValidQuantity(quantity)) {
            System.err.println("Error during purchase: quantity must be greater than 0");
            return 0;
        }

        var item = inventory.getItem(isbn);
        if (item == null) {
            System.err.println("Error during purchase: no book was found with isbn: " + isbn);
            return 0;
        }

        var book = item.getBook();

        if (!isValidBook(book)) {
            System.err.println("Error during purchase: book must be sellable " + book);
            return 0;
        }

        if (!isBookInStock(book, quantity)) {
            System.err.println("Error during purchase: insufficient stock " + book);
            return 0;
        }

        double totalPrice = 0;
        if (book instanceof ISellable sellable) {
            totalPrice = sellable.getPrice() * quantity;
        }

        // main processing
        System.out.println("** PURCHASE **");
        System.out.println("Book: " + book);
        System.out.println("Quantity: x" + quantity);

        // price
        printPrice(book, quantity);

        // post payment
        handleEmail(book, quantity, email);
        handleShipment(book, quantity, address);
        updateStock(book, quantity);

        return totalPrice; // paid amount
    }

    public List<Book> removeOutdatedBooks(int yearsPassed) {
        var outdated = new ArrayList<Book>();

        for (var item : inventory.getAllItems()) {
            var book = item.getBook();
            if (book.getYear().isBefore(LocalDate.now().minusYears(yearsPassed))) {
                outdated.add(book);
                inventory.removeBook(book.getIsbn());
            }
        }

        return outdated;
    }

    private static boolean isValidQuantity(int quantity) {
        return quantity > 0;
    }

    private static boolean isValidBook(Book book) {
        return !(book instanceof DemoBook) && book instanceof ISellable;
    }

    private boolean isBookInStock(Book book, int quantity) {
        // only physical (stockable) books should be validated
        if (book instanceof IStockable) {
            return inventory.getQuantity(book.getIsbn()) >= quantity;
        }

        // digital books are always in stock
        return true;
    }

    private static void printPrice(Book book, int quantity) {
        if (book instanceof ISellable sellable) {
            double totalPrice = sellable.getPrice() * quantity;
            System.out.println("Price: $" + sellable.getPrice());
            System.out.println("Total Price: $" + totalPrice);
        }
    }

    private static void handleEmail(Book book, int quantity, String email) {
        if (book instanceof IDigital digital) {
            EmailService.sendBookViaEmail(email, digital, quantity);
        }
    }

    private static void handleShipment(Book book, int quantity, String address) {
        if (book instanceof IShippable shippable) {
            ShippingService.ship(shippable, quantity, address);
        }
    }

    private void updateStock(Book book, int quantity) {
        if (book instanceof IStockable) {
            inventory.reduceQuantity(book.getIsbn(), quantity);
        }
    }
}
