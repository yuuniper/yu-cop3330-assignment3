/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex43.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDirectory {
    public void makeDirectory(String siteName, String author, String jsFolder, String cssFolder) {
        String directory = createFolder(siteName);
        String index = createHTML(directory, siteName, author);
        String js = createJS(siteName, directory, jsFolder);
        String css = createCSS(siteName, directory, cssFolder);

        printOutput(index, js, css);
    }

    public void printOutput(String index, String js, String css) {
        // Print out File Status
        System.out.println(index);
        System.out.println(js);
        System.out.println(css);
    }

    public static String createCSS(String siteName, String directory, String cssFolder) {
        // If given "y" or "Y", create CSS folder
        if(cssFolder.equals("Y") || cssFolder.equals("y")){
            String path = directory + "\\"+ "css";
            File f = new File(path);
            f.mkdirs();

            return "Created ./website/" + siteName + "/css/";
        }
        // else return no CSS folder
        return "No CSS Folder Created";
    }

    public static String createJS(String siteName, String directory, String jsFolder) {
        // If given "y" or "Y", create JS folder
        if(jsFolder.equals("Y") || jsFolder.equals("y")){
            String path = directory + "\\"+ "js";
            File f = new File(path);
            f.mkdirs();

            return "Created ./website/" + siteName + "/js/";
        }
        // else return no JS folder
        return "No JS Folder Created";
    }

    public static String createHTML(String directory, String siteName, String author) {
        // Create HTML file in website folder
        String path = directory + "\\" + "index.html";
        // Title and Meta
        String title = "<title>" + siteName + "</title>\n";
        String meta = "<meta name= \"author\" content=\""+ author +"\">";

        try{
            // Write title and meta to file
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(title);
            myWriter.write(meta);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Created ./website/" + siteName + "/index.html";
    }

    public static String createFolder(String siteName) {
        // Get Path
        String userPath = System.getProperty("user.dir");
        String directory = userPath + "\\resources\\output";
        String path = directory + "\\"+ siteName;
        // Make file with siteName
        File f = new File(path);
        f.mkdirs();

        System.out.println("Created ./website/" + siteName);
        //System.out.println(path);
        return path;
    }
}
