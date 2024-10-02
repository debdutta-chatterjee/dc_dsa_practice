package com.sdet.practice;

public class ReverseWords {
    public static void main(String[] args)
    {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String str)
    {
        String[] words = str.split(" ");
        StringBuilder reverse = new StringBuilder();
        for(int i= words.length-1;i >=0;i--)
        {
            reverse.append(words[i]);
            reverse.append(" ");
        }
        return reverse.toString();
    }
}
