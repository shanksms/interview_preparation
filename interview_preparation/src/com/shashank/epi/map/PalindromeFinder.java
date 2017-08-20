/**
 * 
 */
package com.epi.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Shashank
 *
 */
public class PalindromeFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canFormPalindrome("AARRRZ"));

	}

	public static boolean canFormPalindrome(String input) {
		Map<String, Integer> charCountMap = new HashMap<>();
		for (char ch : input.toCharArray()) {
			if(charCountMap.get(ch + "") == null) {
				charCountMap.put("" + ch, 1);
			} else {
				charCountMap.put("" + ch, charCountMap.get("" + ch) + 1);
			}
		}
		
		
		List<Integer> valueList = new ArrayList<>(charCountMap.values());
		List<Integer> oddValueList =  valueList.stream()
				 									.filter(value -> value % 2 != 0)
				 									.collect(Collectors.toList());
		
		if (oddValueList.size() == 0 || oddValueList.size() == 1) {
			return true;
		} else {
			return false;
		}
		
	}
}
