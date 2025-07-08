public class EmailService {
    public static void sendBookViaEmail(String email, IDigital book, int quantity) {
        System.out.println("** EMAIL SERVICE **");
        System.out.println("Book: " + book + "\nquantity: " + quantity + " sent to email: " + email);
    }
}
