package com.dsa.arrayandstrings;

public class LengthOfLastWord 
{
	public int lengthOfLastWord(String s) 
	 {
	        String[] arr =s.split(" ");
	        return arr[arr.length-1].length();
	 }
	
	public static void main(String[] args) 
	{
		String s= "Hello World";
		System.out.println(s.substring(s.lastIndexOf(" "),s.length()));
		
		s="   fly me   to   the moon  ";
		s=s.trim();
		System.out.println("*"+s+"**");
		System.out.println(
				s.substring(
                s.lastIndexOf(" ")+1,
                s.length()
            ).length()
		);
	}

}
