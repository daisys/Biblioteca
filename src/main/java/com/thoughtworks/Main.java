package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The Cat in the Hat", "Dr", "2222"));

        Library lib = new Library(System.out, books);
        lib.welcomeUser();
        lib.printBookList();
    }

}
