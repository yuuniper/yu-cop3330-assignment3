/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex45.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution45 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String outputName = getInput("What is the output file name? ");
        SwapWords swap = new SwapWords();
        ArrayList <String> input = swap.readInput();
        String output = swap.getOutput(input, outputName);
        System.out.println(output);
    }
    private static String getInput(String s) {
        // get output name
        System.out.print(s);
        return in.next();
    }
}

