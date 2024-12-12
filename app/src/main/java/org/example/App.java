/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        Library books = new Library();
        books.addBook(new Book("Title", "Author", 56));
        books.addBook(new Book("Thought of God", "Edmund Mulcahy", 2050));
        Library.listBooks();

        Patron person1 = new Patron("John");
        person1.borrowBooks(new Book("Little Red Riding Hood", "Disney", 2012));
        person1.borrowBooks(new Book("Little Red Riding Hood", "Disney", 2012));
        person1.listBorrowedBooks();
    }

}
