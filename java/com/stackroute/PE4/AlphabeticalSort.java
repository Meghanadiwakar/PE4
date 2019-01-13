/*Write a program that sets up a String variable
*  containing a paragraph of text of your choice.
 a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.
*/

package com.stackroute.PE4;

import java.util.Arrays;
import java.util.Comparator;

public class AlphabeticalSort {
    public String wordSortingMethod(String originalString)
    {
        if( originalString == null )
        {
            return null;
        }
        String splitString[] =originalString.split(" ");
        String replaceString="";
        for( String subString : splitString) {
            Character[] wordsArray = new Character[subString.length()];
            for (int i = 0; i < wordsArray.length; i++) {
                wordsArray[i] = subString.charAt(i);
            }
            Arrays.sort(wordsArray, new Comparator<Character>()
            {
                public int compare(Character c1, Character c2)
                {
                    // ignoring case
                    return Character.compare(Character.toLowerCase(c1),
                            Character.toLowerCase(c2));
                }            });
            for( Character c : wordsArray )
            {
                replaceString=replaceString+Character.toString(c);
            }
            replaceString+=" ";
        }
        replaceString=replaceString.trim();

        return replaceString;

    }


}


