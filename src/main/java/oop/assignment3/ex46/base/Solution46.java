/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex46.base;

import java.util.Map;

public class Solution46 {
    public static void main(String[] args) {
        WordSearch count = new WordSearch();
        Map hashmap = count.readInput();
        Map <String, String> sorted = count.createTreeMap(hashmap);
        count.getOutput(hashmap, sorted);
    }
}
