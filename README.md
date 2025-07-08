# FawryQuantumBookstore
This is my solution to the Quantum Bookstore challenge task for the Fawry Internship. 

## Project overview
This is a bookstore system. You can add books of several types (EBook, PaperBook, or DemoBook) to the inventory. EBooks and Demo books have unlimited quantities, unlike paper books, which have limited quantities that can be specified. A book has an ISBN, a title, a year of release, may have a price depending on whether it's sellable (implements the `ISellable` interface) or not, and may have a file type depending on whether it's digital (implements the `IDigital` interface) or not. The system is easily extensible with new book types, just add the feature to an interface and create a new book type class extending the `Book` abstract class and implementing said feature (interface). You can purchase a book by specifying it's ISBN and quantity. The system will validate and process the purchase.

## How to run
- You can run the project directly via any java IDE from the `main()` method in the `Main` class.
- You can also run it using javac in your terminal
- Navigate to the `/src` directory
```bash
javac *.java
java Main
```

## Using test examples
- In the `TestExamples` class, you'll find a number of `public` `static` methods prefixed by `example0*`. These methods are example tests you can run from the `main()` method in the `Main` class to test the system's behavior. Run one example at a time.
- Below is the expected output for each test
  - `TestExamples.example01_addBooks()` : Books are added sucessfuly and displayed in console ✅
  - `TestExamples.example02_purchaseEBook()` : Book is purchased successfully and sent via email ✅
  - `TestExamples.example03_purchasePaperBook()` : Book is purchased sucessfully and shipped to address ✅
  - `TestExamples.example04_purchaseDemoBook()` : Book must be sellable error. (Demo books cannot be purchased) ❌
  - `TestExamples.example05_invalidQuantity()` : Inventory item creation error. (Quantity cannot be negative) ❌
  - `TestExamples.example06_invalidPrice()` : Book creation error. (Price has to be a positive number) ❌
  - `TestExamples.example07_nonExistentBook()` : Inventory error. (No book was found with provided ISBN) ❌
  - `TestExamples.example08_removeOutdatedBooks()` : Outdated books are removed and updated inventory is displayed. ✅
  - `TestExamples.example08_buyRemovedOutdatedBook()` : Outdated books are removed and purchase fails because book is non-existent. ❌
  - `TestExamples.example08_outOfStock()` : Purchase error, insufficient stock. ❌

