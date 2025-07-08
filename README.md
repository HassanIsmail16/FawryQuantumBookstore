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
- In the `TestExamples` class, you'll find a number of `public` `static` methods prefixed by `example0*`. These methods are example tests you can run from the `main()` method in the `Main` class to test the system's behavior.
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
 
## Screenshots of th running up
### Example 01 - Adding Books
![image](https://github.com/user-attachments/assets/b6d10be8-c20d-499f-a75b-44dcd18d774e)

### Example 02 - Purchasing an E-Book
![image](https://github.com/user-attachments/assets/19aa51c2-f53f-4642-a904-e3a19542d43f)

### Example 03 - Purchasing a Paper Book
![image](https://github.com/user-attachments/assets/a8036784-ccf9-47e8-bd0c-9c2e49fe4f66)

### Example 04 - Purchasing a Demo Book
![image](https://github.com/user-attachments/assets/f9b2fab1-ef10-4ec1-a745-fcca03afba9a)

### Example 05 - Invalid Quantity
![image](https://github.com/user-attachments/assets/2a2b5232-23a5-4691-bc90-95c21b8ba454)

### Example 06 - Invalid Price
![image](https://github.com/user-attachments/assets/cc6efeb6-09af-4733-bdcd-13398f42b6e9)

### Example 07 - Non-Existent Book
![image](https://github.com/user-attachments/assets/2aefb9d6-32e1-47ee-aff1-ccaf23a8f03b)

### Example 08 - Removing Outedated Books
![image](https://github.com/user-attachments/assets/454fb1af-32e5-45bd-ac1e-d18b7baa5d05)

### Example 09 - Buying Removed Outdated Books
![image](https://github.com/user-attachments/assets/9d3bb36d-1890-446c-927f-021bda9e580c)

### Example 10 - Out Of Stock
![image](https://github.com/user-attachments/assets/b4f4cf1d-c1cf-43b6-b815-1f050c179ea7)



