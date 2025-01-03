package aspireTest;

interface Borrowable {
    // Method to borrow a book
    void borrowBook(String bookName);

    // Method to return a book
    void returnBook(String bookName);
}

class LibMember implements Borrowable {
    private String memberName;
    private int membershipId;

    // Constructor to initialize LibraryMember attributes
    public LibMember(String memberName, int membershipId) {
        this.memberName = memberName;
        this.membershipId = membershipId;
    }

    // Implementing borrowBook method
    @Override
    public void borrowBook(String bookName) {
        System.out.println(memberName + " (ID: " + membershipId + ") has borrowed the book: " + bookName);
    }

    // Implementing returnBook method
    @Override
    public void returnBook(String bookName) {
        System.out.println(memberName + " (ID: " + membershipId + ") has returned the book: " + bookName);
    }

    // Method to display member details
    public void displayMemberDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership ID: " + membershipId);
    }
}

public class Lib {
    public static void main(String[] args) {
        // Create a LibraryMember object
        LibMember member = new LibMember("Edwin Francis", 12345);

        // Display member details
        System.out.println("Library Member Details:");
        member.displayMemberDetails();

        System.out.println();

        // Borrow and return books
        member.borrowBook("The Great Gatsby");
        member.returnBook("The Great Gatsby");
    }
}

