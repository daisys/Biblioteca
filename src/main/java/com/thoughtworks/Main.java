package com.thoughtworks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alisonpolton-simon on 10/3/14.
 */
public class Main {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The Cat in the Hat", "Dr", "2222"));

        LibraryRunner libraryRunner = new LibraryRunner(bufferedReader, books);
        libraryRunner.run();
    }
}
