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

        printStream.println("Choose from the following options:");
        printStream.println("1: List books");
    }

    public void chooseOption(BufferedReader bufferedReader){

         int selection = readLine(bufferedReader);

        if(selection == 1)  library.printBookList();
  }


    private Integer readLine(BufferedReader bufferedReader) {
        String selection = new String();
        try {
            selection = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(selection);
    }


}
