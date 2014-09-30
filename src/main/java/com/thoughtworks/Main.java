package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> books = new ArrayList<String>();
        books.add("The Cat in the Hat");
        books.add("The Lord of the Rings");
        books.add("Boo!");
        books.add("The Lord of the Flies");
        books.add("Lioness Rampant");
        Library lib = new Library(System.out, books);
        lib.printBookList();
    }

}
