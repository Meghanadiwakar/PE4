package PE4;

import java.util.Scanner;

public class ReplaceAll {

    public String replace(String str)
    {
        String s1= str.replaceAll("d","f");
        String s2= s1.replaceAll("l","t");
        return s2;

    }


    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the InputString:");
        String InputString=str.nextLine();
        String str1=InputString.replaceAll("d", "f");
        String outputString=str1.replaceAll("l", "t");
        System.out.println("Output String after replacing d with f and l with t:\n " + outputString);
    }
}


