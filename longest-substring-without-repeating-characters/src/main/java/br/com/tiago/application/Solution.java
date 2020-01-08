package br.com.tiago.application;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		String s = "dvdf";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {

		Map<Character, Integer> caractereIndex = new HashMap<Character, Integer>();

		int count = 0;
		int size = 0;
		for (int i = 0; i < s.length(); i++) {
			char caractere = s.charAt(i);
			if (caractereIndex.containsKey(caractere)) {
				i = caractereIndex.get(caractere);
				caractereIndex = new HashMap<Character, Integer>();
				size = maiorNumero(size, count);
				count = 0;
			} else {
				caractereIndex.put(caractere, i);
				count++;
				size = maiorNumero(size, count);
			}
		}
		return size;
	}

	public static int maiorNumero(int a, int b) {
		return a >= b ? a : b;
	}

}
