/**
 * 
 */
package com.shashank.epi.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pooja
 *
 */
public class Fibonanncii {
	
	private static Map<Integer, Integer> cache = new HashMap<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0, 1 , 1, 2, 3, 5, 8
		System.out.println(fibonacciNumber(6));
	}
	
	private static int fibonacciNumber(int n) {
		
		if (n <= 1)
			return n;
		if (cache.get(n) == null) {
			cache.put(n, fibonacciNumber(n - 2) + fibonacciNumber(n - 1));
		}
		
		return cache.get(n);
			//return fibonacciNumber(n -1) + fibonacciNumber(n - 2);
				
	}

}
