/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex46.base;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class WordSearch {
    public static Map readInput() {

        Map hashMap = new HashMap();

        try (BufferedReader br = new BufferedReader(new FileReader(getDirectory()))) {
            //StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] animals = line.split(" "); // split line into words

                for (int i = 0; i < animals.length; i++) {
                    // If this is the first occurrence
                    if (hashMap.get(animals[i]) == null) {
                        hashMap.put(animals[i], 1);
                    } else {
                        // Add to previous value
                        int counter = Integer.valueOf(String.valueOf(hashMap.get(animals[i])));
                        counter++;
                        hashMap.put(animals[i], counter);
                    }
                }
                //sb.append(System.lineSeparator());
                line = br.readLine();  // continue while loop
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public static Map <String, String> createTreeMap(Map hashMap) {
        // Sort by using TreeMap
        Map<String, String> sorted = new TreeMap<String, String>(hashMap);

        return sorted;
    }

    public void getOutput(Map hashMap, Map<String, String> sorted) {
        // Print output
        for (Object key : sorted.keySet()) {
            System.out.printf("%10s: %s\n", key, getStars(hashMap.get(key)));
        }
    }

    public static Object getStars(Object o) {
        // Make a string of stars
        StringBuilder str = new StringBuilder();
        int num = Integer.valueOf(String.valueOf(o));

        for (int i = 0; i < num; i++){
            str.append("*");
        }
        return str.toString();
    }

    public static String getDirectory() {
        // Get directory path
        String userPath = System.getProperty("user.dir");
        return userPath + "\\resources\\input\\exercise46_input.txt";
    }

}
