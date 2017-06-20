/**
 * 
 */
package com.shashank.javarevisited.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author pooja
 *
 */
public class DuplicateCharactersInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1("Java");

	}
	
	public static void method1(String str) {
		
		
		
		Character [] charArrObj = new Character[str.length()];
		char [] charArr = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			charArrObj[i] = charArr[i];
		}
		
		Map<Character, Long> map = Arrays.stream(charArrObj)
		.collect(Collectors.groupingBy(t -> t, Collectors.counting()));
		
		List<Character> list = map.entrySet()
		.stream()
		.filter(t -> t.getValue() >= 2)
		.map(t -> t.getKey())
		.collect(Collectors.toList());
		
		System.out.println(list);
		
	}

}
