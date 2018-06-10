/**
 * 
 */
package com.shashank.tushar.roy.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pooja
 *
 */
public class Trie {
	
	private TrieNode root;
	
	
	public Trie() {
		this.root = new TrieNode();
	}

	private class TrieNode {
		Map<Character, TrieNode> children;
		boolean endOfWorld;
		public TrieNode() {
			children = new HashMap<>();
			endOfWorld = false;
		}
	}
	
	public void insert(String word) {
		TrieNode currentNode = root; 
		for (int i = 0; i< word.length(); i++) {
			if (currentNode.children.get(word.charAt(i)) == null) {
				TrieNode tNode = new TrieNode();
				root.children.put(word.charAt(i), tNode);
				currentNode = tNode;
			}
		}
		
		currentNode.endOfWorld = true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
