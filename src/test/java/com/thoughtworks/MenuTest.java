package com.thoughtworks;


import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuTest {

    @Test
    public void shouldDisplayListBooksInMenu(){
        PrintStream printStream = mock(PrintStream.class);
        Menu menu = new Menu(printStream);

        menu.display();

        verify(printStream).println("[L]ist books");
    }
}