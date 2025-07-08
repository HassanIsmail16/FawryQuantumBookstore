import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            // run one example at a time
            TestExamples.example01_addBooks();
//            TestExamples.example02_purchaseEBook();
//            TestExamples.example03_purchasePaperBook();
//            TestExamples.example04_purchaseDemoBook();
//            TestExamples.example05_invalidQuantity();
//            TestExamples.example06_invalidPrice();
//            TestExamples.example07_nonExistentBook();
//            TestExamples.example08_removeOutdatedBooks();
//            TestExamples.example09_buyRemovedOutdatedBook();
//            TestExamples.example10_outOfStock();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}