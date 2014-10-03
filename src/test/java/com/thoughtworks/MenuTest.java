package com.thoughtworks;


import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.is;


public class MenuTest {
    PrintStream printStream;
    Menu menu;
    BufferedReader bufferedReader;
    Library library;


    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        library = mock(Library.class);
        menu = new Menu(printStream, library);
        bufferedReader = mock(BufferedReader.class);

    }

    @Test
    public void shouldDisplayListBooksInMenu(){
        menu.listOptions();

        verify(printStream).println("[L]ist books");
    }

    @Test
    public void shouldPrintWelcomeMessage(){
        menu.welcomeUser();
        verify(printStream).println(contains("Welcome"));
    }

    @Test
    public void shouldReadUserSelection() throws IOException {

        when(bufferedReader.readLine()).thenReturn("L");
        String option = menu.readUserSelection(bufferedReader);

        assertThat(option, is("L"));

    }

    @Test
    public void shouldListBooksWhenUserSelectsL() {

        menu.selectOption("L");

        verify(library).printBookList();
    }
}