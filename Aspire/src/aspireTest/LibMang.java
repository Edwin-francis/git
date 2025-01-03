package aspireTest;

class Library {
    private String libraryName;
    private String location;

    // Constructor to initialize Library attributes
    public Library(String libraryName, String location) {
        this.libraryName = libraryName;
        this.location = location;
    }

    // Method to display library details
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Location: " + location);
    }
}

class LibraryMember extends Library {
    private String memberName;
    private int membershipId;

    // Constructor to initialize LibraryMember attributes
    public LibraryMember(String libraryName, String location, String memberName, int membershipId) {
        super(libraryName, location); // Call the base class constructor
        this.memberName = memberName;
        this.membershipId = membershipId;
    }

    // Method to display library member details
    public void displayMemberDetails() {
        displayLibraryDetails(); // Call the base class method
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership ID: " + membershipId);
    }
}

public class LibMang {
    public static void main(String[] args) {
        // Create a LibraryMember object
        LibraryMember member = new LibraryMember("Central City Library", "Downtown", "Edwin Francis", 12345);

        // Display all details
        System.out.println("Library and Member Details:");
        member.displayMemberDetails();
    }
}

