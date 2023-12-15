package collections;


import java.util.HashMap;
import java.util.Map;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}


public class HashMapExample {

    public static void main(String[] args) {
        // HashMap to hold books with a unique ID for each book
        Map<Integer, Book> library = new HashMap<>();

        // Adding books to the HashMap
        library.put(1, new Book("1984", "George Orwell", 1949));
        library.put(2, new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.put(3, new Book("Brave New World", "Aldous Huxley", 1932));

        // Searching for a book by ID
        int bookIdToFind = 2;
        if (library.containsKey(bookIdToFind)) {
            System.out.println("Found book: " + library.get(bookIdToFind));
        } else {
            System.out.println("No book found with ID: " + bookIdToFind);
        }

        // Displaying all books in the library
        System.out.println("\nAll books in the library:");
        for (Map.Entry<Integer, Book> entry : library.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " - " + entry.getValue());
        }

        // Removing a book
        int bookIdToRemove = 1;
        library.remove(bookIdToRemove);
        System.out.println("\nAfter removing book ID " + bookIdToRemove + ", library contains:");
        library.forEach((id, book) -> System.out.println("ID: " + id + " - " + book));
    }

}
