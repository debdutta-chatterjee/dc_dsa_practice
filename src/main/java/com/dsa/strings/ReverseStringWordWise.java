package com.dsa.strings;

public class ReverseStringWordWise
{
    public static String reverseStringWordWise(String input) {
        StringBuilder reverse = new StringBuilder();
        String[] splitString =input.split(" ");
        for(int i =splitString.length-1; i>=0; i-- )
        {
            reverse.append(splitString[i]);
            reverse.append(" ");
        }
        return reverse.toString().trim();
    }
}
