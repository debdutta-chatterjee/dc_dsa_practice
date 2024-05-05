package com.dsa.strings;
import java.util.*;
public class LongestNonRepeatingSubstring
{
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);
        int len = longestUniqueSubsttr(str);
        System.out.println(
                "The length of the longest non-repeating character " +
                        "substring is " + len);
        len = longestUniqueSubsttrHash("aab");
        System.out.println(
                "The length of the longest non-repeating character " +
                        "substring is " + len);

    }

    public static int longestUniqueSubsttrHash(String str)
    {
        if(str.length()<=1) return str.length();

        HashMap<Character, Integer> map = new HashMap();
        int maxlength=0;
        int currMax=0;
        int start=0;
        for(int i=0;i<str.length();)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),1);
                currMax++;
                i++;
            }
            else{
                start++;
                i=start;
                map = new HashMap();
                if(currMax > maxlength) maxlength=currMax;
                currMax=0;
            }
        }
        if(currMax > maxlength) maxlength=currMax;
        return maxlength;
    }

    public static int longestUniqueSubsttr(String str) {
        int maxLength = 0;
        if (!str.isEmpty()) {

            int[] lastIndex = new int[256];
            Arrays.fill(lastIndex, -1);

            int i = 0;
            for (int j = 0; j < str.length(); j++) {
                i = Math.max(i, lastIndex[str.charAt(j)] + 1);
                maxLength = Math.max(maxLength, j - i + 1);
                lastIndex[str.charAt(j)] = j;
            }
        }
        return maxLength;
    }
}

