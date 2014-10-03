package com.thoughtworks;

import java.io.BufferedReader;
import java.util.List;

public class LibraryRunner {

    private final List<Book> books;
    private BufferedReader bufferedReader;
    private Menu menu;
    private Library library;

    public LibraryRunner(BufferedReader bufferedReader, List<Book> books, Menu menu) {
        this.bufferedReader = bufferedReader;
        this.books = books;
    }

    public void run() {
        library = new Library(System.out, books);
        menu = new Menu(System.out, library);

        menu.welcomeUser();
        menu.listOptions();
        menu.chooseOption(bufferedReader);
    }

}
