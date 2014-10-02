package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class LibraryTest {
    List<Book> books;
    Library library;
    PrintStream printStream;
    private Book book2;
    private Book book1;

    @Before
    public void setUp(){
        books = new ArrayList<Book>();
        printStream = mock(PrintStream.class);
        library =  new Library(printStream, books);
        book1 = mock(Book.class);
        book2 = mock(Book.class);
    }

    @Test
    public void shouldPrintOneBookWhenOneBookInList(){
        books.add(book1);
        when(book1.details()).thenReturn("zzz");
        library.printBookList();

        verify(printStream).println("zzz");
    }

    @Test
    public void shouldPrintTwoTitlesWhenTwoBooksList(){
        books.add(book1);
        books.add(book2);
        when(book1.details()).thenReturn("zzz");
        when(book2.details()).thenReturn("xxx");

        library.printBookList();

        verify(printStream).println("zzz");
        verify(printStream).println("xxx");
    }

    @Test
    public void shouldPrintWelcomeMessage(){
        library.welcomeUser();
        verify(printStream).println(contains("Welcome"));
    }


}
