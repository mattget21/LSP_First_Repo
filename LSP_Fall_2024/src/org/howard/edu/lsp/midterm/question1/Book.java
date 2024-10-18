package org.howard.edu.lsp.midterm.question1;
/**
 * Represents a book in a library.
 * Contains details such as the title, author, ISBN, and the year of publication.
 * Provides methods to access and modify these details.
 * Also provides methods to compare books and return a string representation.
 * 
 * @author Matthew Getachew
 */
public class Book {
    private String title, author, ISBN; 
    private int yearPublished;

    public Book(String title, String author, String ISBN, int year) {
        this.title = title; this.author = author; this.ISBN = ISBN; this.yearPublished = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book) obj;
            return this.ISBN.equals(other.ISBN) && this.author.equals(other.author);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + 
               ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
