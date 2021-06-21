/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex41.base;

import java.io.FileWriter;
import java.io.IOException;
/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */
import java.util.ArrayList;

public class Output {

    public void printOutput(ArrayList<String> sortedArray) {
        try {
            // Get Directory
            String userPath = System.getProperty("user.dir");
            String directory = userPath + "\\resources\\output\\exercise41_output.txt";

            // Write to file
            FileWriter myWriter = new FileWriter(directory);
            myWriter.write("Total of " + sortedArray.size() + " names\n");
            myWriter.write("-----------------\n");

            // Iterate through sorted List
            for (String s : sortedArray){
                myWriter.write(s+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
