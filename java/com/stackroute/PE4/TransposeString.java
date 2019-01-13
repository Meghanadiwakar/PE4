/*Write a program to transpose the given string.
 */

package com.stackroute.PE4;

public class TransposeString {
    public String reverseMyString(String str) {
        if (str != null) {
            String[] words = str.split(" ");
            String reversedString = "";
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversedString = reversedString + reverseWord + " ";
            }
            String reversedString1 = reversedString.trim();
            return reversedString1;
        }
        return null;

    }
}