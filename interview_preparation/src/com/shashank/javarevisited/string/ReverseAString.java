/**
 * 
 */
package com.shashank.javarevisited.string;

import java.util.Arrays;

/**
 * @author pooja
 *
 */
public class ReverseAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1("shashank");

	}
	
	public static void method1(String str) {
		char [] charArr = str.toCharArray();
		int i = 0, j = str.length() -1;
		
		while(i < j) {
			char temp = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = temp;
			i++; j--;
		}
		
		System.out.println(Arrays.toString(charArr));
	}

}
