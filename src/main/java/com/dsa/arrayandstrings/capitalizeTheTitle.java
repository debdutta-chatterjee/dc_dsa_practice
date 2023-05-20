package com.dsa.arrayandstrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class capitalizeTheTitle 
{
	public static void main(String[] args)
	{
		String title = "First leTTeR of EACH Word";
		title=title.toLowerCase();
		
		List<String> s1 =Arrays.stream(title.split(" "))
		.filter(w -> w.length()>2)
		.map(w -> w.toCharArray())
		.map(w -> w[0]=(char) (w[0]+32))
		.map(c -> String.valueOf(c))
		.collect(Collectors.toList());
		
		System.out.println(s1);
		
		String[] arr = title.split(" ");
		StringBuilder sb= new StringBuilder();
		for(String s: arr)
		{
			if(s.length()>2) sb.append(s.substring(0, 1).toUpperCase()+s.substring(1));
			else sb.append(s);
			sb.append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
