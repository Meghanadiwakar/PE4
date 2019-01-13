/*Write a program to find out the multiple occurrences of
* the given word in a string using Matcher methods*/

package com.stackroute.PE4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurence {
    public List<String> findOccurrence(String sentence, String patternString){
        List<String> indexes = new ArrayList<>();
        if(sentence!=null && patternString!=null) {
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(sentence);
            while (matcher.find()) {
                indexes.add(String.valueOf(matcher.start()));
                indexes.add("-");
                indexes.add(String.valueOf(matcher.end()));
            }
        }
        else{
            indexes.add("invalid");
        }
        return indexes;
    }
}
