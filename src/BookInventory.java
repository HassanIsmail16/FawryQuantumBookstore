import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class BookInventory {
    private final Map<String, InventoryItem> inventory = new HashMap<>();

    public void addBook(Book book, int quantity) {
        if (inventory.containsKey(book.getIsbn())) { // handle existing isbn
            inventory.get(book.getIsbn()).setQuantity(inventory.get(book.getIsbn()).getQuantity() + quantity);
        } else { // handle new isbn
            inventory.put(book.getIsbn(), new InventoryItem(book, quantity));
        }
    }

    public void removeBook(String isbn) { inventory.remove(isbn); }

    public void reduceQuantity(String isbn, int quantity) {
        if (inventory.containsKey(isbn)) { // handle existing isbn
            inventory.get(isbn).reduceQuantity(quantity);
        } else {
            throw new IllegalArgumentException("Error during inventory reduction: no book was found with isbn: " + isbn);
        }
    }

    public InventoryItem getItem(String isbn) {
        if (!inventory.containsKey(isbn)) {
            throw new IllegalArgumentException("Error during inventory reduction: no book was found with isbn: " + isbn);
        }
        return inventory.get(isbn);
    }

    public Book getBook(String isbn) { return getItem(isbn).getBook(); }
    public int getQuantity(String isbn) { return getItem(isbn).getQuantity(); }

    public List<InventoryItem> getAllItems() { return new ArrayList<>(inventory.values()); }
}
