/**
 * 
 */
package com.shashank.dynamic_programming;

import java.util.Arrays;

/**
 * @author pooja
 *
 */
public class LIS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(method1(new int[] {10, 22, 9, 33, 21, 50, 41, 60})));
		
	}
	
	private static int[] method1(int [] input) {
		int [] lis = new int[input.length];
		
		for (int c = 0; c < lis.length; c++) {
			lis[c] = 1;
		}
		
		//System.out.println(Arrays.toString(lis));
		int len = input.length;
		
		for (int i = 1; i < len; i++ ) {
			
			for (int j = 0; j < i; j++) {
				if (input[i] > input[j] && (lis[j] + 1) > lis[i]) {
					lis[i]  = lis[j] + 1;
				}
			}
			
		}
		
		
		return lis;
	}
	

}
