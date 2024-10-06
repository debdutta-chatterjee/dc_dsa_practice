package com.sdet.practice;

public class RemoveConsecutiveDuplicates
{
    public static void main(String[] args)
    {
        System.out.println(removeConsecutiveDuplicates("aaaaabbbbbb"));
        //Output: ab
        System.out.println(removeConsecutiveDuplicates("geeksforgeeks"));
        //Output: geksforgeks
        System.out.println(removeConsecutiveDuplicates("aabccba"));
        //Output: abcba
    }
    public static String removeConsecutiveDuplicates(String str)
    {
        StringBuilder remove = new StringBuilder();
        remove.append(str.charAt(0));
        for(int i=1;i<str.length();i++)
        {
            char lastChar = remove.charAt(remove.length()-1);
            if(lastChar == str.charAt(i))
                continue;
            else
                remove.append(str.charAt(i));
        }
        return remove.toString();
    }
}
