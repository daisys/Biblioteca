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

    //TODO
    //Variable argument function for library-building
    //And for library-verifying

    @Test
    public void shouldPrintOneBookWhenOneBookInList(){
        createBooks("zzz");

        library.printBookList();

        verifyBooks("zzz");
    }

    @Test
    public void shouldPrintTwoBooksWhenTwoBooksInList(){
        createBooks("zzz", "xxx");

        library.printBookList();

        verifyBooks("zzz", "xxx");
    }

    private void verifyBooks(String... names) {
        for (String name : names) {
            verify(printStream).println(name);
        }
    }

    private void createBooks(String... names) {
        for (String name : names) {
            Book book = mock(Book.class);
            when(book.details()).thenReturn(name);
            books.add(book);
        }
    }


}
