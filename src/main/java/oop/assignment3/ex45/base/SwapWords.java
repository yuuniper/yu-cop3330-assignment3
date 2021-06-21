/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex45.base;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SwapWords {
    public static ArrayList<String> readInput() {
        ArrayList<String> input = new ArrayList<String>();

        try {
            // get path
            String userPath = System.getProperty("user.dir");
            File file = new File(userPath
                    + "\\resources\\input\\exercise45_input.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            int counts = comparator(input, br); // compare and replace
            fr.close();    //closes the stream and release the resources

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public static int comparator(ArrayList<String> input, BufferedReader br) throws IOException {
        int counter = 0; // counter for num of lines that contain "utilize"
        String line;
        while((line= br.readLine())!=null)
        {
            if (line.contains("utilize")){
                // replace utilize with use
                String changed = line.replace("utilize", "use");
                input.add(changed); // add changed line to array
                counter++;
            } else{
                // add line with no "utliize" in it
                input.add(line);
            }
        }
        return counter;
    }

    public static String getOutput(ArrayList<String> input, String outputName) {
        try {
            // get path
            String userPath = System.getProperty("user.dir");
            String directory = userPath + "\\resources\\output\\" + outputName + ".txt";
            // write to file
            FileWriter myWriter = new FileWriter(directory);

            for (String s : input){
                myWriter.write(s+"\n"); // iterate through list and write output
            }
            myWriter.close();

            return "Successfully wrote to the file.";
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "An error occurred";
    }
}
