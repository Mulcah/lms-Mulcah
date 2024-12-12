package org.example;

public class Book {

    // This is your working class.
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return year;
    }

    public void setYearPublished(int year) {
        this.year = year;
    }

    public String toString() {
        return "The title of the book is " + title + " and published on " + year + " and written by " + author;
    }
}
