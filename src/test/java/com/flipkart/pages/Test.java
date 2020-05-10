package com.flipkart.pages;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] array = { 1, 22, 22, 3, 5 };
//		Set<Integer> hs = new HashSet<Integer>();
//		for (Integer item : array) {
//			hs.add(item);
//		}
//		System.out.println(hs);
//
		Integer[] a = {1,22,3,4,22};
		Integer[] b = {5,24,5,6,24};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println("arrays are same");
				}
			}
		}
		
	}	

}
