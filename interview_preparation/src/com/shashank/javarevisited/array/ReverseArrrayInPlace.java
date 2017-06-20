/**
 * 
 */
package com.shashank.javarevisited.array;

import java.util.Arrays;

/**
 * @author pooja
 *
 */
public class ReverseArrrayInPlace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(new Integer[]{1, 3, 5, 4, 2, 9});

	}
	
	
	public static void method1(Integer [] a) {
		int i = 0; int j = a.length -1;
		int temp = 0;
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++; j--;
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
