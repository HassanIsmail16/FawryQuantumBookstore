import jdk.dynalink.Operation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            TestExamples.example01_addBooks();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();


        try {
            TestExamples.example02_purchaseEBook();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            TestExamples.example03_purchasePaperBook();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            TestExamples.example04_purchaseDemoBook();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            TestExamples.example05_invalidQuantity();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            TestExamples.example06_invalidPrice();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            TestExamples.example07_nonExistentBook();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            TestExamples.example08_removeOutdatedBooks();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            TestExamples.example09_buyRemovedOutdatedBook();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            TestExamples.example10_outOfStock();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}