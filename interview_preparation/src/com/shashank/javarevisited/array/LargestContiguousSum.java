/**
 * 
 */
package com.shashank.javarevisited.array;

/**
 * @author pooja
 *
 */
public class LargestContiguousSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(new Integer[]{-10, 2, 3, -2, 0, 5, -15});

	}
	
	public static void method1(Integer [] arr) {
		int largestSum = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum  + arr[j];
				largestSum = Integer.max(largestSum, sum);
				
				
			}
			
		}
		
		System.out.println("largest sum " + largestSum);
		
	}

}
