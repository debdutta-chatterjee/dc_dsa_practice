package com.sdet.practice;

import java.util.ArrayList;
import java.util.List;

public class CountVowels
{
    public static void main(String[] args)
    {
        String input ="geeksforgeeks portal";
        System.out.println(countVowels(input));
        System.out.println(removeVowels(input));
    }

    public static int countVowels(String str)
    {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(vowels.contains(str.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }

    public static String removeVowels(String str)
    {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        StringBuilder strWithoutVowels = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            if(!vowels.contains(str.charAt(i)))
            {
                strWithoutVowels.append(str.charAt(i));
            }
        }
        return strWithoutVowels.toString();
    }
}
