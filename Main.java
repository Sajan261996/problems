class Book {
    private String title;
    private String author;
    private int yearPublished;

    // Parameterized constructor to initialize the attributes
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an array of 3 Book objects
        Book[] books = new Book[3];

        // Initializing the books array with book objects
        books[0] = new Book("Java: The Complete Reference", "Herbert Schildt", 2021);
        books[1] = new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 2008);
        books[2] = new Book("The Alchemist", "Paulo Coelho", 1988);

        // Displaying the details of all books
        for (Book book : books) {
            book.displayDetails();
        }
    }
}