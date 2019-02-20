/*Write a java program to count the total number of occurrences of a given character in a string
without using any loop?*/

package com.stackroute;

public class CountChar {

    /**
     *This method counts the no of occurences of a given character in a string
     * @param input
     * @return
     */
    public int countCharacter (char character,String input){

        //calculates the no of occurences
        int result=input.length() - (input.replaceAll(String.valueOf(character),"").length());

        //returns the no of occurences
        return result;
    }
}
