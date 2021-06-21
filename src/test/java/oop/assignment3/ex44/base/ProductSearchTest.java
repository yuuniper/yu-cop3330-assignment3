/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex44.base;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {

    String userPath = System.getProperty("user.dir");
    String directory =  userPath + "\\resources\\input\\exercise44_input.json";
    File input = new File(directory);
    JsonElement fileElement;

    {
        try {
            fileElement = JsonParser.parseReader(new FileReader(input));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    JsonObject fileObject = fileElement.getAsJsonObject();
    JsonArray jsonArrayofProducts = fileObject.get("products").getAsJsonArray();


    @Test
    void getDirectory() {
        String userPath = System.getProperty("user.dir");
        String directory =  userPath + "\\resources\\input\\exercise44_input.json";

        assertEquals(directory, ProductSearch.getDirectory());

    }

    @Test
    void getProduct_true(){
        boolean found = ProductSearch.getProduct(jsonArrayofProducts, "Thing", false);
        assertEquals(true, found);
    }

    @Test
    void getProduct_false(){
        boolean found = ProductSearch.getProduct(jsonArrayofProducts, "muppets", false);
        assertEquals(false, found);
    }
}