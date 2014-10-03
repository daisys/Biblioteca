package com.thoughtworks;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuTest {
    PrintStream printStream;
    Menu menu;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        menu = new Menu(printStream);
    }

    @Test
    public void shouldDisplayListBooksInMenu(){
        menu.displayBooks();

        verify(printStream).println("[L]ist books");
    }

    @Test
    public void shouldPrintWelcomeMessage(){
        menu.welcomeUser();
        verify(printStream).println(contains("Welcome"));
    }
}