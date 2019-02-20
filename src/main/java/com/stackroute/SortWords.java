/*Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.*/

package com.stackroute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWords {

    /**
     * This methods sorts the string without using a loop
     * @param para
     * @return List
     */
    public List<String> sort(String para){
        String[] array= para.split("\\s");

        //convert Aarray into a list
        List<String> words = Arrays.asList(array);
        Collections.sort(words);
        return words;
    }

}
