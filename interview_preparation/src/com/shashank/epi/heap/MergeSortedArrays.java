/**
 * 
 */
package com.epi.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Shashank
 *
 */
public class MergeSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input1 = Arrays.asList(0, 2);
		List<Integer> input2 = Arrays.asList(1, 3, 6);
		List<Integer> input3 = Arrays.asList(7, 8);
		
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(input1);
		lists.add(input2);
		lists.add(input3);
		System.out.println(mergeSortedLists(lists));
	}
	
	
	public static List<Integer> mergeSortedLists(List<List<Integer>> listOfSortedIntegers) {
		
		List<Iterator<Integer>> iters = new ArrayList<>(listOfSortedIntegers.size());
		
		for (List<Integer> list : listOfSortedIntegers) {
			iters.add(list.iterator());
		}
		
		PriorityQueue<Entry> minHeap = new PriorityQueue<>(listOfSortedIntegers.size(), 
				new Comparator<Entry>() {

					@Override
					public int compare(Entry o1, Entry o2) {
						// TODO Auto-generated method stub
						return o1.value.compareTo(o2.value);
					}
				
				});
		
		List<Integer> output = new ArrayList<>();
		
		int idOfList = 0;
		
		for (Iterator<Integer> iter : iters) {
			
			if (iter.hasNext()) {
				Entry entry = new Entry(iter.next(), idOfList);
				//System.out.println(entry);
				minHeap.add(entry);
			}
			idOfList++;
			
			
		}
		
		while (minHeap.size() > 0) {
			Entry entry = minHeap.poll();
			output.add(entry.getValue());
			//System.out.println(entry.getListId());
			if (iters.get(entry.getListId()).hasNext()) {
				Entry toAdd = new Entry(iters.get(entry.getListId()).next(),
					entry.getListId());
				minHeap.add(toAdd);
			}
			
			
		}
		
		return output;
	}

}


