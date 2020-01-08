package br.com.tiago.application;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] nums = { 3,2, 4 };
		int target = 6;
		for (int i : twoSum(nums, target)) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {

		List<Integer> vals = new ArrayList<Integer>();
		for (int num : nums) {
			vals.add(num);
		}

		int[] solution = { 0, 0 };
		char j = 0;
		for (int i = 0; i < vals.size(); i++) {
			
			int diff = target - vals.get(i);
			
			vals.remove(i);
			if (vals.contains(diff)) {
				j++;
				if(j==1) {
					solution[0] = i;
				}
				if(j == 2) {
					solution[1] = i;
					break;
				}
			}
			vals.add(i, nums[i]);
		}
		return solution;
        
        /* Map<Integer, Integer> h = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int n = target - nums[i];

			if (h.containsKey(nums[i])) {
				int[] arr = { h.get(nums[i]), i };
				return arr;
			} else {
				h.put(n, i);
			}

		}
		int[] arr = { 0, 0 };
		return arr; */
	}
}