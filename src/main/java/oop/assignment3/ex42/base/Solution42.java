/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex42.base;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Solution42 {

    public static void main(String[] args) {
        InputOutput readFile = new InputOutput();

        ArrayList<String> unparsed = readFile.readInput();
        Split stringmaker = new Split();
        ArrayList<String> sorted = stringmaker.replaceCommas(unparsed);

        readFile.printOutput(sorted);
    }
}
