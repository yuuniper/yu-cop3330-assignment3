package oop.assignment3.ex41.base;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */
public class Solution41 {

    public static void main(String[] args) {

        ArrayList<String> unsortedArray = readInput();

        Sort alphabetize = new Sort();
        ArrayList<String> sortedArray = alphabetize.rearrange(unsortedArray);

        Output display = new Output();
        display.printOutput(sortedArray);
    }

    public static ArrayList<String> readInput() {
        ArrayList<String> input = new ArrayList<String>();

        try {
            // Get Path
            String userPath = System.getProperty("user.dir");
            String directory = userPath + "\\resources\\input\\exercise41_input.txt";

            // Read in File
            File file = new File(directory);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;

            while((line=br.readLine())!=null)
            {
                input.add(line); // Add line into Arraylist
            }
            fr.close();    //closes the stream and release the resources

            for (String s: input){
                System.out.println(s); // print input to check
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
