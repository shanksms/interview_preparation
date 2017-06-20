/**
 * 
 */
package com.shashank.javarevisited.string;

import java.util.Arrays;

/**
 * @author pooja
 *
 */
public class CheckAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2("army", "mary");

	}
	
	public static void method1(String str1, String str2) {
		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));
	}
	
	public static void method2(String str1, String str2) {
		char [] chArr = str1.toCharArray();
		
		StringBuilder sb = new StringBuilder(str2);
		boolean isAnagram = true;
		
		for (char ch : chArr) {
			int index = sb.indexOf("" + ch);
			if (index != -1) {
				sb.deleteCharAt(index);
			} else {
				isAnagram = false;
				 break;
			}
		}
		
		System.out.println(isAnagram);
		
	}

}
