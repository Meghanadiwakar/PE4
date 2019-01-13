/*Write a program to replace all d with f and all l with t in the given String*/

package com.stackroute.PE4;

import java.util.Scanner;

public class ReplaceAll {
    public String replace(String str) {
        String s1 = str.replaceAll("d", "f");
        String s2 = s1.replaceAll("l", "t");
        return s2;

    }
}

