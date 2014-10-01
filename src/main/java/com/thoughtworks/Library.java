package com.thoughtworks;

import java.io.PrintStream;
import java.util.List;

public class Library {
    PrintStream printStream;
    List<String> books;

    public Library(PrintStream printStream, List<String> books){
        this.printStream = printStream;
        this.books = books;
    }

    public void printBookList() {
        printStream.println("Welcome!");
        for (String book : books) {
            printStream.println(book);
        }
    }
}
