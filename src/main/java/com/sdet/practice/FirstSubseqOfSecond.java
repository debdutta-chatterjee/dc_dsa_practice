package com.sdet.practice;

/*

Given two strings s1 and s2,
find if the first string is a Subsequence of the second string,
i.e. if s1 is a subsequence of s2.
A subsequence is a sequence that can be derived
from another sequence by deleting some elements
without changing the order of the remaining elements.

Examples :

Input: s1 = “AXY”, s2 = “ADXCPY”
Output: True
All characters of s1 are in s2 in the same order


Input: s1 = “AXY”, s2 = “YADXCP”
Output: False
All characters are present, but order is not same.


Input: s1 = “gksrek”, s2 = “geeksforgeeks”
Output: True

 */

public class FirstSubseqOfSecond
{
    public static void main(String[] args)
    {
        System.out.println(firstSubseqOfSecond("gksrek","geeksforgeeks"));
        System.out.println(firstSubseqOfSecond("AXY","YADXCP"));
        System.out.println(firstSubseqOfSecond("AXY","ADXCPY"));
    }

    public static boolean firstSubseqOfSecond(String first, String second)
    {
        int i =0;
        int j =0;
        while(i<first.length() && j < second.length())
        {
            if(first.charAt(i) == second.charAt(j))
                i++;
            j++;
        }
        return i == first.length();
    }
}
