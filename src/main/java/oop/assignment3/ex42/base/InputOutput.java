/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex42.base;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class InputOutput {
    public static ArrayList<String> readInput() {
        ArrayList<String> input = new ArrayList<String>();

        try {
            // get path
            String userPath = System.getProperty("user.dir");
            File file = new File(userPath + "\\resources\\input\\exercise42_input.txt");
            // read in file
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while((line=br.readLine())!=null)
            {
                input.add(line); // add line to Arraylist
            }
            fr.close();    //closes the stream and release the resources

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public void printOutput(ArrayList<String> sorted) {
        // Print output to console
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        for (String s : sorted){
            System.out.println(s); // Iterate through sorted Arraylist
        }
    }
}
