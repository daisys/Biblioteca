package com.thoughtworks;

import java.io.PrintStream;
import java.util.List;

public class Library {
    PrintStream printStream;
    List<Book> books;

    public Library(PrintStream printStream, List<Book> books){
        this.printStream = printStream;
        this.books = books;
    }

    public void printBookList() {
        printStream.println(String.format("%-40s %-20s %-4s", "Title", "Author", "Year"));
        for (Book book : books) {
            printStream.println(book.details());
        }
    }


}
