package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {

    @Test
    void itShowsEmptyMinefield()    {
        assertArrayEquals(new String [] ( "000", "000" ), displayMinefield(new String[] ( "...", "..." )));
    }

    private String[] displayMinefield(String[] input) {
        return new String[0];
    }
}
