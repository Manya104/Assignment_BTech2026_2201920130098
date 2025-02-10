import java.util.*;

abstract class Book {
    protected String title, author;
    protected int bookId;
    protected boolean isAvailable = true;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public abstract void display();
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void borrowBook() {
        if (isAvailable) isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }
}

class LibraryBook extends Book {
    public LibraryBook(int bookId, String title, String author) {
        super(bookId, title, author);
    }

    public void display() {
        System.out.println("ID: " + bookId + " | Title: " + title + " | Author: " + author + " | Available: " + (isAvailable ? "Yes" : "No"));
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) book.display();
    }

    public void borrowBook(int bookId) {
        for (Book book : books) {
            if (book.bookId == bookId && book.isAvailable()) {
                book.borrowBook();
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.bookId == bookId && !book.isAvailable()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid return attempt.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new LibraryBook(1, "Effective Java", "Joshua Bloch"));
        library.addBook(new LibraryBook(2, "Clean Code", "Robert C. Martin"));
        library.addBook(new LibraryBook(3, "The Pragmatic Programmer", "Andrew Hunt"));

        library.displayBooks();
        library.borrowBook(1);
        library.displayBooks();
        library.returnBook(1);
        library.displayBooks();
    }
}
