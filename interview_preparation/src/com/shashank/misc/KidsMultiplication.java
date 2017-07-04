/**
 * 
 */
package com.shashank.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author pooja
 *
 */
public class KidsMultiplication {
	
	public static void main(String[] args) {
		method1(99, 99);
	}
	
	public static void method1(int num1, int num2) {
		StringBuilder numStr1 = new StringBuilder(num1 + "").reverse();
		StringBuilder numStr2 = new StringBuilder(num2 + "").reverse();
		
		int[] multiplication = new int[numStr1.length() + numStr2.length()];
		
		int len = 0;
		for (int c2 = 0; c2 < numStr2.length(); c2++) {
			
			for (int c1 = 0; c1 < numStr1.length(); c1++) {
				multiplication[c1 + c2] = Integer.parseInt(numStr1.charAt(c1) + "") * Integer.parseInt(numStr2.charAt(c2) + "") + multiplication[c1 + c2];
				len = c1 + c2 + 1;
				
			}
			
		}
		
		System.out.println(Arrays.toString(multiplication));
		
		
		
		List<Integer> ls = new ArrayList<>();
		int carry = 0;
		for (int i = 0; i < len; i++) {
			multiplication[i] = multiplication[i] + carry;
			if (i == len-1) { 
				ls.add(multiplication[i]);
				break;
			}
			if (multiplication[i] >= 10) {
				ls.add(multiplication[i] % 10);
				carry = multiplication[i] / 10;
			} else {
				ls.add(multiplication[i]);
			}
			
		}
		
		Collections.reverse(ls);
		StringBuilder sb = new StringBuilder();
		ls.stream()
		  .forEach(e -> sb.append(e));
		
		System.out.println(sb.toString());
		
		
		
		
	}

}
