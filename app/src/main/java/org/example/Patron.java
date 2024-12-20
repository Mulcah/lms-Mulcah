package org.example;

import java.util.ArrayList;

public class Patron {
 private String name;
 private static ArrayList<Book> borrowedBooks = new ArrayList<>();
 private static ArrayList<Book> books = new ArrayList<>();

 public Patron(String name) {
  this.name = name;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public void borrowBooks(Book book) {
  borrowedBooks.add(book);
 }

 public void returnBooks(Book book) {
  books.add(book);
 }

 public void listBorrowedBooks() {
  for (int book = 0; book < borrowedBooks.size(); book++) {
   System.out.println(borrowedBooks.get(book));
  }
 }
}
