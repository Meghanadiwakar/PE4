package PE4;

import java.util.Scanner;

public class TransposeString {
    public String reverseMyString(String str)
    {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        String reversedString1=reversedString.trim();
        return reversedString1;
    }
    public static void main(String[] args)
    {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputString=str.nextLine();
        TransposeString obj = new TransposeString();
        obj.reverseMyString(inputString);
    }
}

