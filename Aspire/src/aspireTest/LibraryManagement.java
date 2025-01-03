package aspireTest;

class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize Book attributes
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

class EBook extends Book {
    private double fileSize; // File size in MB
    private String format; // Format (e.g., PDF, EPUB)

    // Constructor to initialize EBook attributes
    public EBook(String title, String author, String isbn, double fileSize, String format) {
        super(title, author, isbn); // Call the base class constructor
        this.fileSize = fileSize;
        this.format = format;
    }

    // Overriding the displayInfo method to include EBook details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        System.out.println("Book Details:");
        book.displayInfo();

        System.out.println();

        // Create an EBook object
        EBook ebook = new EBook("1984", "George Orwell", "9780451524935", 1.5, "EPUB");
        System.out.println("EBook Details:");
        ebook.displayInfo();
    }
}
