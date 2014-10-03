package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
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

    public void listOptions() {
        printStream.println("[L]ist books");
    }

    public String readUserSelection(BufferedReader bufferedReader){

        String selection = new String();

        selection = readLine(bufferedReader, selection);

        return selection;
    }

    private String readLine(BufferedReader bufferedReader, String selection) {
        try {
            selection = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return selection;
    }
}
