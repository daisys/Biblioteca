package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class TestLibrary {
    public static final String aBook = "aaaaa";
    public static final String anotherBook = "bbbbb";
    List<String> books;
    Library library;
    PrintStream printStream;

    @Before
    public void setUp(){
        books = new ArrayList<String>();
        printStream = mock(PrintStream.class);
        library =  new Library(printStream, books);
    }

    @Test
    public void shouldPrintOneTitleWhenOneBookInList(){
        books.add(aBook);
        library.printBookList();

        verify(printStream).println(aBook);
    }

    @Test
    public void shouldPrintTwoTitlesWhenTwoBooksList(){
        books.add(aBook);
        books.add(anotherBook);
        library.printBookList();

        verify(printStream).println(aBook);
        verify(printStream).println(anotherBook);
    }

    @Test
    public void shouldPrintWelcomeMessage(){
        library.printBookList();
        verify(printStream).println(contains("Welcome"));
    }
}
