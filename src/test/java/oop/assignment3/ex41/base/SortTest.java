/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex41.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void rearrange_get_first_element() {
        ArrayList<String> unsortedArray = Solution41.readInput();
        String firstElement = Sort.rearrange(unsortedArray).get(0);
        assertEquals("Johnson, Jim", firstElement);
    }
    @Test
    void rearrange_get_last_element() {
        ArrayList<String> unsortedArray = Solution41.readInput();
        String lastElement = Sort.rearrange(unsortedArray).get(unsortedArray.size() - 1);
        assertEquals("Zarnecki, Sabrina", lastElement);
    }
}