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
			char ch = word.charAt(i);
			TrieNode childNode = currentNode.children.get(ch) ;
			
			if (childNode == null) {
				childNode = new TrieNode();
				currentNode.children.put(word.charAt(i), childNode);
			}
			currentNode = childNode;

		}
		
		currentNode.endOfWorld = true;
	}
	
	public boolean searchWord(String word) {
		char cArr [] = word.toCharArray();
		TrieNode currentNode = root; 
		for ( int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (currentNode.children.containsKey(word.charAt(i))) {
				currentNode = currentNode.children.get(ch);
			} else {
				return false;
			}
			
		}

		if (currentNode.endOfWorld) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
		trie.insert("shashank");
		trie.insert("abc");
		System.out.println(trie.searchWord("abc"));
		System.out.println(trie.searchWord("shashank"));

	}

}
