package br.com.tiago.application;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		int target = 6;
		for (int i : twoSum(nums, target)) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int diff = 0;

		List<Integer> vals = new ArrayList<Integer>();
		for (int num : nums) {
			vals.add(num);
		}

		List<Integer> indexesWithDifferentValues = new ArrayList<Integer>();
		List<Integer> indexesWithSameValues = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {

			diff = target - nums[i];

			if (diff - nums[i] == 0) {
				indexesWithSameValues.add(i);
			}

			if (vals.contains(diff) && diff != vals.get(i)) {
				indexesWithDifferentValues.add(i);
			}
		}

		int[] solution = { 0, 0 };

		if (indexesWithSameValues.size() == 2) {
			solution[0] = indexesWithSameValues.get(0);
			solution[1] = indexesWithSameValues.get(1);
		} else {
			solution[0] = indexesWithDifferentValues.get(0);
			solution[1] = indexesWithDifferentValues.get(1);
		}

		return solution;
	}
}
