/*Write a program with the implementation of Regular Expression to find the presence of the name*/

package com.stackroute;

import java.util.regex.Pattern;

public class FindRegex {

    /**
     * This method finds the name Harry in a given string
     * @param input
     * @return
     */
    public String findName(String input){
        String result="";

        //Checks for the name Harry
        if(Pattern.compile("Harry").matcher(input).find()){
            result="Is Harry here?True";
        }
        else {
            result="Is Harry here?No";
        }

        //retiurns the result
        return result;
    }
}

