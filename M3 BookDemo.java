class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Constructor with title and author only
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; // default price
    }

    // Constructor with all fields
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class BookDemo {
    public static void main(String[] args) {

        // Using default constructor
        Book b1 = new Book();
        b1.display();

        // Using constructor with title and author
        Book b2 = new Book("Java Programming", "James Gosling");
        b2.display();

        // Using constructor with all parameters
        Book b3 = new Book("Python Essentials", "Guido van Rossum", 499.99);
        b3.display();
    }
}
