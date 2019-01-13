/*Write a program to find out the multiple occurrences
of the given word in a string using Matcher methods.
 */

package com.stackroute.PE4;

public class StringOccurence {
    // Method that return count of the given
    // character in the string

    //    StringOccurence obj = new StringOccurence();
    public int count(String s, char c) {
        int res = 0;
        if (s != null) {

            for (int i = 0; i < s.length(); i++) {
                // checking character in string
                if (s.charAt(i) == c)
                    res++;
            }
            return res;
        }
        return 0;
    }
}

