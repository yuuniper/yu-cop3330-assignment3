/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex42.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SplitTest {

    @Test
    void replaceCommas_is_the_same() {
        List<String> unparsed = Arrays.asList("Ling,Mai,55900",
                "Johnson,Jim,56500",
                "Jones,Aaron,46000",
                "Jones,Chris,34500",
                "Swift,Geoffrey,14200",
                "Xiong,Fong,65000",
                "Zarnecki,Sabrina,51500");
        ArrayList<String> otherList = new ArrayList<>();
        otherList.addAll(unparsed);

        List<String> namesList = Arrays.asList("Ling      Mai       55900     ",
                "Johnson   Jim       56500     ",
                "Jones     Aaron     46000     ",
                "Jones     Chris     34500     ",
                "Swift     Geoffrey  14200     ",
                "Xiong     Fong      65000     ",
                "Zarnecki  Sabrina   51500     ");
        assertEquals(Split.replaceCommas(otherList), namesList);
    }

}