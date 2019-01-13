/*Write a program with the implementation of Regular Expression
* to find the presence of the name Harry in a string.
 */

package com.stackroute.PE4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    //this method uses regex//
    public boolean checkPresence(String sentence){
        if(sentence!=null){
            Pattern p = Pattern.compile("Harry");
            Matcher m = p.matcher(sentence);
            if (m.find()) return true;
            else return false;
        }
        else
            return false;
    }
}
