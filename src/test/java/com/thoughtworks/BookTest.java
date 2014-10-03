package com.thoughtworks;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class BookTest {

    @Test
    public void shouldReturnProperlyFormattedBook(){
        Book book = new Book("aaa", "bbb", "ccc");

        assertThat(book.details(), is("aaa                                      bbb                  ccc "));
    }

}
