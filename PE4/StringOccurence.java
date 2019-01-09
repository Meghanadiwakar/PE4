package PE4;

public class StringOccurence {
    // Method that return count of the given
    // character in the string

//    StringOccurence obj = new StringOccurence();
    public int count(String s, char c)
    {
        int res = 0;

        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
                res++;
        }
        return res;
    }

    // Driver method
//    public static void main(String args[])
//    {
//        StringOccurence obj = new StringOccurence();
//        String str= "lanisters always pay debt";
//        char c = 'e';
//        System.out.println(obj.count(str, c));
//    }
}

