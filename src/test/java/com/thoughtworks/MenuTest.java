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

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        menu = new Menu(printStream);
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


        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("L");
        String option = menu.readUserSelection(bufferedReader);

        assertThat(option, is("L"));

    }
}