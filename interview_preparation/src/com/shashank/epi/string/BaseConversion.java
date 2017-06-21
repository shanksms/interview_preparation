/**
 * 
 */
package com.shashank.epi.string;

/**
 * @author pooja
 *
 */
public class BaseConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(2, 16, "1000");
		

	}
	
	public static void method1(int b1, int b2, String number) {
		
		int numAsInt = 0;
		for (int i = 0; i < number.length(); i++) {
			numAsInt = numAsInt*b1;
			
			numAsInt = numAsInt + (Character.isDigit(number.charAt(i)) ? number.charAt(i) - '0' : number.charAt(i) - 'A' + 10 );
			
		}
		
		
		System.out.println(numAsInt);
		
		
		
	}
	
	public static void convertToBase(int number, int b2) {
		StringBuilder sb = new StringBuilder();
		
		while (number != 0) {
			sb.append(number%b2 >= 10? number%b2 - 10 + 'A' : number%b2);
			number = number/b2;
		}
		
		System.out.println(sb.reverse().toString());
		
	}

}
