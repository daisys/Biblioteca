package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class TestLibrary {
    public static final String aTitle = "aaaaa";
    public static final String anAuthor = "bbbb";
    public static final String aYear = "cccc";
    public static final String anotherTitle = "1111";
    public static final String anotherAuthor = "2222";
    public static final String anotherYear = "3333";
    List<Book> books;
    Library library;
    PrintStream printStream;

    @Before
    public void setUp(){
        books = new ArrayList<Book>();
        printStream = mock(PrintStream.class);
        library =  new Library(printStream, books);
    }

    @Test
    public void shouldPrintOneBookWhenOneBookInList(){
        books.add(new Book(aTitle,anAuthor,aYear));
        library.printBookList();

        verify(printStream).println(String.format("%-40s %-20s %-4s", aTitle, anAuthor, aYear));
    }

    @Test
    public void shouldPrintTwoTitlesWhenTwoBooksList(){
        books.add(new Book(aTitle,anAuthor,aYear));
        books.add(new Book(anotherTitle,anotherAuthor, anotherYear));
        library.printBookList();

        verify(printStream).println(String.format("%-40s %-20s %-4s", aTitle, anAuthor, aYear));
        verify(printStream).println(String.format("%-40s %-20s %-4s", anotherTitle, anotherAuthor, anotherYear));
    }

    @Test
    public void shouldPrintWelcomeMessage(){
        library.printBookList();
        verify(printStream).println(contains("Welcome"));
    }


}
