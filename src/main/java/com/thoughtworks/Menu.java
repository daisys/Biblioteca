package com.thoughtworks;

import java.io.PrintStream;

/**
 * Created by qwillduvall on 10/2/14.
 */
public class Menu {

    private final PrintStream printStream;

    public Menu(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void welcomeUser() {
        printStream.println("Welcome!");
    }

    public void displayBooks() {
        printStream.println("[L]ist books");
    }
}
