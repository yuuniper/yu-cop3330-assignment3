/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex42.base;

import java.util.ArrayList;

public class Split {

    public static ArrayList<String> replaceCommas(ArrayList<String> unparsed) {

        ArrayList <String> output = new ArrayList<String>();

        for (String s : unparsed){
            StringBuilder stringBuilder = new StringBuilder();
            String spaces = s.replace(",", " ");
            // Spilt the string into words
            String [] split = spaces.split(" ");

            for (String l : split){
                // append to StringBuilder so that it can be properly formatted
                stringBuilder.append(String.format("%-10s", l));
            }

            String finalString = stringBuilder.toString(); // convert
            output.add(finalString); // add to output Arraylist
        }
        return output;
    }
}
