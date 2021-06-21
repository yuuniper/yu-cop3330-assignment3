/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package oop.assignment3.ex46.base;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    @Test
    void readInput_contains_word() {
        Map hashmap = WordSearch.readInput();

        assertTrue(hashmap.containsKey("badger") && hashmap.get("badger") != null);
        assertTrue(hashmap.containsKey("mushroom") && hashmap.get("mushroom") != null);
        assertTrue(hashmap.containsKey("snake") && hashmap.get("snake") != null);
    }

    @Test
    void createTreeMap_contains_first_word_correct() {
        Map hashmap = WordSearch.readInput();
        Map treemap =  WordSearch.createTreeMap(hashmap);
        String firstKey = (String) treemap.keySet().stream().findFirst().get();
        assertEquals("badger", firstKey);
    }
    @Test
    void createTreeMap_contains_first_word_incorrect() {
        Map hashmap = WordSearch.readInput();
        Map treemap =  WordSearch.createTreeMap(hashmap);
        String firstKey = (String) treemap.keySet().stream().findFirst().get();
        assertNotEquals("snake", firstKey);
    }

    @Test
    void getStars_correct() {
        Map hashmap = WordSearch.readInput();
        String stars = "**";
        assertEquals(stars, WordSearch.getStars(hashmap.get("mushroom")));
    }

    @Test
    void getDirectory_correct() {
        String userPath = System.getProperty("user.dir");
        String directory =  userPath + "\\resources\\input\\exercise46_input.txt";
        assertEquals(directory, WordSearch.getDirectory());
    }
}