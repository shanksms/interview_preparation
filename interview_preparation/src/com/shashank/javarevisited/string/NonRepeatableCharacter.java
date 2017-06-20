/**
 * 
 */
package com.shashank.javarevisited.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author pooja
 *
 */
public class NonRepeatableCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) 
			method2("Morning");
			
		
	}
	
	public static void method1(String str) {
		Character[] charObjectArray = str.chars()
				.mapToObj(c -> (char)c)
				.toArray(Character[] :: new);
		
		
		List<Character> nonRepeatableChars = Arrays.stream(charObjectArray)
			  .collect(Collectors.groupingBy(t -> t,LinkedHashMap::new, Collectors.counting()))
			  .entrySet()
			  .stream()
			  .filter(t -> t.getValue() == 1)
			  .map(t -> t.getKey())
			  .collect(Collectors.toList());
		System.out.println(nonRepeatableChars.get(0));
		
			  
		
	}
	
	public static void method2(String str) {
		Character[] charObjectArray = str.chars()
				.mapToObj(c -> (char)c)
				.toArray(Character[] :: new);
		
		LinkedHashMap<Character, Long> map = new LinkedHashMap<>();
		for (Character ch : charObjectArray) {
			if (map.get(ch) == null) {
				map.put(ch, 1l);
			} else {
				map.put(ch, map.get(ch) + 1l);
			}
		}
		
		Set<Map.Entry<Character, Long>> entrySet = map.entrySet();
		
		for (Map.Entry<Character, Long> entry : entrySet) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
