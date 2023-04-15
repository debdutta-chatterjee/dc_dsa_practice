package com.dsa.arrayandstrings;

public class ReverseString_CharArray {

	public static void main(String[] args) {
		String s= "Hello";
		reverseString(s.toCharArray());

	}
	
	public static void reverseString(char[] s) 
    {
        char temp;
        for(int i=0,j=s.length-1;i<j;i++,j--)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }	
}
