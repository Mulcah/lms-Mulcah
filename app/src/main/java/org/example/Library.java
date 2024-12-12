package org.example;

import java.util.ArrayList;

public class Library {
 private static ArrayList<Book> books = new ArrayList<>();

 public void addBook(Book book) {
  books.add(book);
 }

 public static void listBooks() {
  for (int book = 0; book < books.size(); book++) {
   System.out.println(books.get(book));
  }
 }
}
