/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex41.base;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static ArrayList<String> rearrange(ArrayList<String> unsortedArray) {
        // Sort the Arraylist
        Collections.sort(unsortedArray);
        return unsortedArray;
    }
}
