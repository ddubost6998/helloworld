package com.damien;

public class StringProcessor {

    /**
     * Counts the number of words in a given sentence.
     * @param sentence the input sentence
     * @return the number of words
     */
    public static int wordsCount(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        return sentence.split("\\s+").length;
    }

    /**
     * Reverses the given word.
     * @param word the input word
     * @return the reversed word
     */
    public static String reverser(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    /**
     * Checks if a word is a palindrome.
     * @param word the input word
     * @return true if the word is a palindrome, false otherwise
     */
    public static boolean palindromic(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}