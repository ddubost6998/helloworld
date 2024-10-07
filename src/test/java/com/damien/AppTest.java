package com.damien;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AppTest {

    @Test
    public void testWordsCount() {
        String sentence = "As you walk on the way , the way appears";
        assertEquals(10, StringProcessor.wordsCount(sentence));
    }

    @Test
    public void testReverser() {
        String word = "hello";
        assertEquals("olleh", StringProcessor.reverser(word));
    }

    @Test
    public void testPalindromic() {
        assertTrue(StringProcessor.palindromic("radar"));
        assertFalse(StringProcessor.palindromic("hello"));
    }

    public static void main(String[] args) {
        
        // Test wordsCount
        String sentence = "As you walk on the way, the way appears";
        System.out.println("Word count: " + StringProcessor.wordsCount(sentence));

        // Test reverser
        String word = "hello";
        System.out.println("Reversed: " + StringProcessor.reverser(word));

        // Test palindromic
        String palindrome = "radar";
        System.out.println("Is palindrome: " + StringProcessor.palindromic(palindrome));
    }
}