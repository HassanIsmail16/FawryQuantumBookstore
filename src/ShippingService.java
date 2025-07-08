public class ShippingService {
    public static void ship(IShippable book, int quantity, String address) {
        System.out.println("** SHIPPING SERVICE **");
        System.out.println(book.toString() + " quantity: " + quantity + " has been shipped to address " + address);
    }
}
