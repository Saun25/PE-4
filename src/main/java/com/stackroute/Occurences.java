/*Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.*/

package com.stackroute;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurences {

    /**
     * This method finds the occurence of the given string in a text using matcher class
     * @param input
     * @return
     */
    public String[] wordOccurence(String input){
        String result[]=new String[3];
        int i=0;

        //initializing the Matcher object
        Matcher matcher =Pattern.compile("se").matcher(input);

        //finding and storing the start and end point of the matched expression
        while(matcher.find()) {
            result[i] = "found: "
                    + matcher.start() + " - " + matcher.end();
            i++;
        }

        //return the result
            return result;
    }
}
