package com.thoughtworks;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();


        books.add(new Book("The Cat in the Hat", "Dr", "2222"));

        Library lib = new Library(System.out, books);

        Menu menu = new Menu(System.out, lib);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        menu.welcomeUser();
        menu.listOptions();
        menu.readUserSelection(bufferedReader);

        lib.printBookList();
    }

}
