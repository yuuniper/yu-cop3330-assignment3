/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex41.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void readInput_check_same() {
        List<String> namesList = Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina",
                "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong");

        ArrayList<String> otherList = new ArrayList<>();
        otherList.addAll(namesList);

        assertEquals(otherList, Solution41.readInput());
    }
}