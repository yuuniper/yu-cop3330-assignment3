/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex43.base;

import java.util.Scanner;

public class Solution43 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String siteName = getInput("Site name: ");
        String author = getInput("Author: ");
        String jsFolder = getInput("Do you want a folder for JavaScript? ");
        String cssFolder = getInput("Do you want a folder for CSS? ");

        CreateDirectory folder = new CreateDirectory();
        folder.makeDirectory(siteName, author, jsFolder, cssFolder);
    }

    private static String getInput(String s) {
        System.out.print(s);
        return in.nextLine();
    }
}
