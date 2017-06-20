package com.shashank.javarevisited.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(method1(new int[] {1, 2, 3, 1, 5}, 1));

		
	}
	
	public static boolean method1(int [] input, int number) {
		boolean found = false;
		
		int size = input.length;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i : input) {
			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
			
		}
		Set<Map.Entry<Integer, Integer>> set =  map.entrySet();
		 
		for (Map.Entry<Integer, Integer> entry : set) {
			if (entry.getValue() > size/2) {
				found = true;
				break;
			}
			
		}
		
		return found;
	}

}
