/**
 * 
 */
package com.shashank.epi.string;

/**
 * @author pooja
 *
 */
public class RunLengthEncodeDecode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//encode("aabbb");
		//decode("2a4b100c");

		for (int i = 0; i < 5; ++i) {
			
			System.out.println(i);
		}
	}
	
	
	public static void encode(String inputStr) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 1; i <= inputStr.length(); i++) {
			
			if (i == inputStr.length() || inputStr.charAt(i) != inputStr.charAt(i-1)) {
				sb.append(count + "" + inputStr.charAt(i-1));
				count = 1;
			} else {
				count++;
			}
			
		}
		
	}
	
	public static void decode(String inputStr) {
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			
			
			if (Character.isDigit(inputStr.charAt(i))) {
				count = count * 10 + inputStr.charAt(i) - '0';
			} else {
				while (count > 0) {
					sb.append(inputStr.charAt(i));
					count--;
				}
				
			}
			
			
		}
		
		System.out.println(sb.toString());
		
		
	}

}
