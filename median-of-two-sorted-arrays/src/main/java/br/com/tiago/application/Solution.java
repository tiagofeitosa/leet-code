package br.com.tiago.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    
	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {		
		List<Double> allArrayInAList = new ArrayList<Double>();
		
        for (int numArray1 : nums1) {
			allArrayInAList.add((double) numArray1);
		}
		
		for (int numArray2 : nums2) {
			allArrayInAList.add((double) numArray2);
		}
		
		Collections.sort(allArrayInAList);
		
		int index = allArrayInAList.size()/2;
		if(allArrayInAList.size() % 2 == 0) {
			return (allArrayInAList.get(index) + allArrayInAList.get(index - 1))/2;
		} else {
			return allArrayInAList.get(index);
		}
    }
}