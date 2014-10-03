package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by qwillduvall on 10/2/14.
 */
public class Menu {

    private final PrintStream printStream;
    private final Library library;

    public Menu(PrintStream printStream, Library library
    ) {
        this.printStream = printStream;
        this.library = library;
    }

    public void welcomeUser() {
        printStream.println("Welcome!");
    }

    public void listOptions() {
        printStream.println("[L]ist books");
    }

    public void chooseOption(BufferedReader bufferedReader){

        String selection = new String();

         selection = readLine(bufferedReader, selection);

        if(selection == "L")  library.printBookList();
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
