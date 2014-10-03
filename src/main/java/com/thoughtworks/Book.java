package com.thoughtworks;

public class Book {

    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year){
        this.title = title;
        this.author = author;
        this.year = year;

    }

    public String details() {
        return String.format("%-40s %-20s %-4s", title, author, year);
    }
}
