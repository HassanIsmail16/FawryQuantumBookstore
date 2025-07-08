import java.time.LocalDate;

public class TestExamples {
    public static void example01_addBooks() {
        System.out.println("======= EXAMPLE 01 - ADD BOOKS =======");
        BookStore store = new BookStore();

        EBook book1 = new EBook("0001", "Book 1", LocalDate.of(2020, 1, 1), "PDF", 10.99);
        PaperBook book2 = new PaperBook("0002", "Book 2", LocalDate.of(2020, 1, 1), 19.99);
        DemoBook book3 = new DemoBook("0003", "Book 3", LocalDate.now());
        PaperBook book4 = new PaperBook("0004", "Book 4", LocalDate.now(), 24.45);

        store.getInventory().addBook(book1, 10);
        store.getInventory().addBook(book2, 20);
        store.getInventory().addBook(book2, 20);
        store.getInventory().addBook(book3, 30);
        store.getInventory().addBook(book4, 40);

        System.out.println("** INVENTORY CONTENT AFTER ADDING BOOKS **");
        for (var item : store.getInventory().getAllItems()) {
            System.out.println(item);
        }
    }

    public static void example02_purchaseEBook() {
        System.out.println("======= EXAMPLE 02 - PURCHASING AN EBOOK =======");
        BookStore store = new BookStore();

        EBook book1 = new EBook("0001", "Book 1", LocalDate.of(2020, 1, 1), "PDF", 10.99);

        store.getInventory().addBook(book1, 10);

        var totalPaid = store.purchase(book1.getIsbn(), 5, "hassan@gmail.com", "hassan's place");

        System.out.println("Total Paid: " + totalPaid);
    }

    public static void example03_purchasePaperBook() {
        System.out.println("======= EXAMPLE 03 - PURCHASING A PAPER BOOK =======");
        BookStore store = new BookStore();

        PaperBook book2 = new PaperBook("0002", "Book 2", LocalDate.of(2020, 1, 1), 19.99);

        store.getInventory().addBook(book2, 20);

        var totalPaid = store.purchase(book2.getIsbn(), 5, "hassan@gmail.com", "hassan's place");

        System.out.println("Total Paid: " + totalPaid);
    }

    public static void example04_purchaseDemoBook() {
        System.out.println("======= EXAMPLE 04 - PURCHASING A DEMO BOOK =======");
        BookStore store = new BookStore();

        DemoBook book3 = new DemoBook("0003", "Book 3", LocalDate.now());

        store.getInventory().addBook(book3, 30);

        var totalPaid = store.purchase(book3.getIsbn(), 5, "hassan@gmail.com", "hassan's place");

        System.out.println("Total Paid: " + totalPaid);
    }

    public static void example05_invalidQuantity() {
        System.out.println("======= EXAMPLE 05 - INVALID QUANTITY =======");
        BookStore store = new BookStore();

        PaperBook book2 = new PaperBook("0002", "Book 2", LocalDate.of(2020, 1, 1), 19.99);

        store.getInventory().addBook(book2, -30); // negative quantity

    }

    public static void example06_invalidPrice() {
        System.out.println("======= EXAMPLE 06 - INVALID PRICE =======");
        BookStore store = new BookStore();

        // negative price
        PaperBook book2 = new PaperBook("0002", "Book 2", LocalDate.of(2020, 1, 1), -19.99);

    }

    public static void example07_nonExistentBook() {
        System.out.println("======= EXAMPLE 07 - NON-EXISTENT BOOK =======");
        BookStore store = new BookStore();

        var totalPaid = store.purchase("0002", 5, "hassan@gmail.com", "hassan's place");

        System.out.println("Total Paid: " + totalPaid);
    }

    public static void example08_removeOutdatedBooks() {
        System.out.println("======= EXAMPLE 08 - REMOVING OUTDATED BOOKS =======");
        BookStore store = new BookStore();

        EBook book1 = new EBook("0001", "Book 1", LocalDate.of(2020, 1, 1), "PDF", 10.99);
        PaperBook book2 = new PaperBook("0002", "Book 2", LocalDate.of(2020, 1, 1), 19.99);
        DemoBook book3 = new DemoBook("0003", "Book 3", LocalDate.now());
        PaperBook book4 = new PaperBook("0004", "Book 4", LocalDate.now(), 24.45);

        store.getInventory().addBook(book1, 10);
        store.getInventory().addBook(book2, 20);
        store.getInventory().addBook(book2, 20);
        store.getInventory().addBook(book3, 30);
        store.getInventory().addBook(book4, 40);

        var outdated = store.removeOutdatedBooks(2);
        System.out.println("** OUTDATED BOOKS REMOVED **");
        for (var item : outdated) {
            System.out.println(item);
        }

        System.out.println("** INVENTORY CONTENT AFTER REMOVING OUTDATED BOOKS **");
        for (var item : store.getInventory().getAllItems()) {
            System.out.println(item);
        }
    }

    public static void example09_buyRemovedOutdatedBook() {
        System.out.println("======= EXAMPLE 09 - BUYING A REMOVED OUTDATED BOOK =======");
        BookStore store = new BookStore();

        EBook book1 = new EBook("0001", "Book 1", LocalDate.of(2020, 1, 1), "PDF", 10.99);
        PaperBook book2 = new PaperBook("0002", "Book 2", LocalDate.of(2020, 1, 1), 19.99);
        DemoBook book3 = new DemoBook("0003", "Book 3", LocalDate.now());
        PaperBook book4 = new PaperBook("0004", "Book 4", LocalDate.now(), 24.45);

        store.getInventory().addBook(book1, 10);
        store.getInventory().addBook(book2, 20);
        store.getInventory().addBook(book2, 20);
        store.getInventory().addBook(book3, 30);
        store.getInventory().addBook(book4, 40);

        var outdated = store.removeOutdatedBooks(2);
        System.out.println("** OUTDATED BOOKS REMOVED **");
        for (var item : outdated) {
            System.out.println(item);
        }

        System.out.println("** INVENTORY CONTENT AFTER REMOVING OUTDATED BOOKS **");
        for (var item : store.getInventory().getAllItems()) {
            System.out.println(item);
        }

        var totalPaid = store.purchase(book1.getIsbn(), 5, "hassan@gmail.com", "hassan's place");

        System.out.println("Total Paid: " + totalPaid);
    }

    public static void example10_outOfStock() {
        System.out.println("======= EXAMPLE 10 - OUT OF STOCK =======");
        BookStore store = new BookStore();

        PaperBook book2 = new PaperBook("0002", "Book 2", LocalDate.of(2020, 1, 1), 19.99);

        store.getInventory().addBook(book2, 2);

        var totalPaid = store.purchase(book2.getIsbn(), 5, "hassan@gmail.com", "hassan's place");

        System.out.println("Total Paid: " + totalPaid);
    }
}
