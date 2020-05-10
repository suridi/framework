package com.flipkart.testcases;

import java.util.HashMap;
import java.util.Set;

public class Test {

	
	 static void removeDuplicates(String inputstring) {
		 System.out.println(inputstring);
		HashMap<Character, Integer> countchmap = new HashMap<Character, Integer>();
		char[] ch = inputstring.toCharArray();
		System.out.println(ch);
		for(char c: ch) {
			if(countchmap.containsKey(c)) {
				countchmap.put(c, countchmap.get(c)+1);
			}
			else
				countchmap.put(c, 1);
		}		
		Set<Character> keys =countchmap.keySet();
		System.out.println(countchmap.keySet());
		for(char le : keys) 
		{
			if(countchmap.get(le)>1) 
			{
				System.out.println(le +":"+countchmap.get(le));
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeDuplicates("suresh kumar");

	}

}
