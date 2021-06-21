/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex43.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateDirectoryTest {
    String userPath = System.getProperty("user.dir");
    String directory =  userPath + "\\resources\\output\\JellyBeansCo";

    @Test
    void createCSS_test_makes_folder() {
        CreateDirectory test = new CreateDirectory();
        String checkCSS = CreateDirectory.createCSS("JellyBeansCo",directory, "y");

        assertEquals("Created ./website/JellyBeansCo/css/", checkCSS);
    }
    @Test
    void createCSS_test_does_not_make_folder() {
        CreateDirectory test = new CreateDirectory();
        String checkCSS = CreateDirectory.createCSS("JellyBeansCo",directory, "n");

        assertEquals("No CSS Folder Created", checkCSS);
    }

    @Test
    void createJS_makes_folder() {
        CreateDirectory test = new CreateDirectory();
        String checkJS = CreateDirectory.createJS("JellyBeansCo",directory, "y");

        assertEquals("Created ./website/JellyBeansCo/js/", checkJS);
    }

    @Test
    void createJS_test_does_not_make_folder() {
        CreateDirectory test = new CreateDirectory();
        String checkJS = CreateDirectory.createJS("JellyBeansCo", directory, "n");

        assertEquals("No JS Folder Created", checkJS);
    }

    @Test
    void createHTML_works() {
        CreateDirectory test = new CreateDirectory();
        String checkHTML = CreateDirectory.createHTML(directory, "JellyBeansCo", "Olivia Rodrigo");

        assertEquals("Created ./website/JellyBeansCo/index.html", checkHTML);
    }

    @Test
    void createFolder_works() {

        CreateDirectory test = new CreateDirectory();
        String userPath = System.getProperty("user.dir");
        String directory =  userPath + "\\resources\\output\\JellyBeansCo";
        assertEquals(directory, CreateDirectory.createFolder("JellyBeansCo"));
    }
}