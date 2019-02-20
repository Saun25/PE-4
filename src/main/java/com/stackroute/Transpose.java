/*Write a program to transpose the given string.*/

package com.stackroute;

public class Transpose {

    /**
     * This method transposes the words in a string
     * @param input
     * @return String
     */
    public String transposeWords(String input) {
        String result="";
        
        //split the word into an array
        String[] words = input.split("\\s");

        //transposes the words
        for (int i = 0; i < words.length;i++) {
            String s = words[i];
            String reverse="";
            for (int j = s.length() - 1; j>= 0; j--) {
                reverse = reverse + s.charAt(j);
            }
            result = result.concat(reverse).concat(" ");
        }

        //returns the result
        return result.trim();
    }
}
