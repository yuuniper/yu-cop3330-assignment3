/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex45.base;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SwapWordsTest {

    @Test
    void readInput_correct_input() {
         ArrayList<String> input = new ArrayList<String>();
         input.add("One should never use the word \"use\" in writing. Use \"use\" instead.");
         input.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
         input.add("uses an IDE to write her Java programs\".");

        assertEquals(input, SwapWords.readInput());
    }

    @Test
    void comparator_correct_num() {
        ArrayList<String> input = new ArrayList<String>();
        try{
            String userPath = System.getProperty("user.dir");
            File file = new File(userPath + "\\resources\\input\\exercise45_input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            assertEquals(2, SwapWords.comparator(input, br));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getOutput_works() {
        assertEquals("Successfully wrote to the file.",
                SwapWords.getOutput(SwapWords.readInput(), "ex45"));
    }
}