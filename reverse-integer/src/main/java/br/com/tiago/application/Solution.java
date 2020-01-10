package br.com.tiago.application;

public class Solution {
	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-456));
	}
	
	public static int reverse(int x) {
		String str = Integer.toString(x);
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();

		if (str.contains("-")) {
			str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
		}

		return Double.valueOf(str) > Integer.MAX_VALUE || Double.valueOf(str) < Integer.MIN_VALUE ? 0
				: Integer.valueOf(str).intValue();
	}
}
