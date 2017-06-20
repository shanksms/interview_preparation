/**
 * 
 */
package com.shashank.javarevisited.array;

import java.util.Arrays;

/**
 * @author pooja
 *
 */
public class PairSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1(new int[] {1, 2, 3, 4, 5},  9);
	}
	
	
	public static boolean method1(int [] input, int sumToFind) {
		Arrays.sort(input);
		
		int i = 0;
		int j = input.length - 1;
		boolean found = false;
		while (i < j) {
			if (input[i] + input[j] == sumToFind) {
				found = true;
				break;
			} else if(input[i] + input[j] > sumToFind) {
				j--;
			} else {
				i++;
			}
			
		}
		
		return found;
			
	}

}
