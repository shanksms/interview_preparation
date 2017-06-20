package com.shashank.javarevisited.string;

import java.util.regex.Pattern;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1("1234");

	}
	
	public static void method1(String str) {
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		System.out.println(!pattern.matcher(str).matches());
		
	}

}
