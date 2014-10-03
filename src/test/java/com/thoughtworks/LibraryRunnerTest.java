package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.BufferedReader;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryRunnerTest {
    BufferedReader bufferedReader;
    ArrayList<Book> books;
    private Menu menu;


    @Before
    public void setUp(){
        bufferedReader = mock(BufferedReader.class);
        books = new ArrayList<Book>();
        menu = mock(Menu.class);

    }



}