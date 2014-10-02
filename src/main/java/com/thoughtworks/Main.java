package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        Menu menu = new Menu(System.out);
        books.add(new Book("The Cat in the Hat", "Dr", "2222"));
        Library lib = new Library(System.out, books);
        lib.welcomeUser();
        menu.display();

        lib.printBookList();

    }

}
