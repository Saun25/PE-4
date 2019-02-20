/*Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry*/

package com.stackroute;

public class ReplaceString {

    /**
     * This method returns the String after replacing a character in the given string with the desired character
     * @param input
     * @return
     */
    public String replace(String input){

        //replaces the characters and assigns it to result
        String result= input.replaceAll("d","f").replaceAll("l","t");

        //returns the new string
        return result;
    }

}
