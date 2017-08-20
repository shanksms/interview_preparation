/**
 * 
 */
package com.epi.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Shashank
 *
 */
public class AnagramFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findAnagrams(Arrays.asList("abcz", "bca", "abcdz", "bcda")));

	}
	
	public static List<List<String>> findAnagrams(List<String> words) {
		Map<String, List<String>> mapOfAnagramsWithSortedStrAsKey = new HashMap<>();
		
		for (String word : words) {
			char[] sortedChars = word.toLowerCase().toCharArray();
			Arrays.sort(sortedChars);
			String sortedStr = new String(sortedChars);
			if (mapOfAnagramsWithSortedStrAsKey.get(sortedStr) != null) {
				mapOfAnagramsWithSortedStrAsKey.get(sortedStr).add(word);
				
			} else {
				List<String> anagramGroup = new ArrayList<>();
				anagramGroup.add(word);
				mapOfAnagramsWithSortedStrAsKey.put(sortedStr, anagramGroup);
			}
			
		}
		
		return new ArrayList<>(mapOfAnagramsWithSortedStrAsKey.values());
	}
	

}
