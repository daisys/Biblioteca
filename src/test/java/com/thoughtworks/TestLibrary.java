package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class TestLibrary {
    List<String> books;
    Library lib;
    PrintStream printStream;

    @Before
    public void setUp(){
        books = new ArrayList<String>();
        printStream = mock(PrintStream.class);
        lib =  new Library(printStream, books);
    }

    @Test
    public void shouldPrintOneTitleWhenOneBookInList(){
        books.add("The Cat in the Hat");
        lib.printBookList();

        verify(printStream).println("The Cat in the Hat");
    }

    @Test
    public void shouldPrintTwoTitlesWhenTwoBooksList(){
        books.add("The Cat in the Hat");
        books.add("The Lord of the Rings");
        lib.printBookList();

        verify(printStream).println("The Cat in the Hat");
        verify(printStream).println("The Lord of the Rings");
    }


}
