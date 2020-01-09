package br.com.tiago.application;

public class Solution {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(1);
		
		ListNode l2 = new ListNode(5);
		
		ListNode res = addTwoNumbers(l1,l2);
		
		while(res!=null) {
			System.out.print(res.val);
			res = res.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sumOne = 0;
		int sumAux = 0;
		int x = 0;
		int y = 0;
		ListNode resultSum = null;
		while(l1 != null || l2 != null || sumOne != 0) {			
			if(l1 != null) {
				x = l1.val;
				l1 = l1.next;
			} else {
				x = 0;
			}
			
			if(l2 != null) {
				y = l2.val;
				l2 = l2.next;
			} else {
				y = 0;
			}
			
			sumAux = sumOne + x + y;
			if(sumAux > 9) {
				sumAux = sumAux - 10;
				sumOne = 1;
			} else {
				sumOne = 0;
			}
			resultSum = appendRecursive(resultSum, sumAux);
		}
		
		return resultSum;
	}
	
	private static ListNode appendRecursive(ListNode head, int data) {
		ListNode list = head;
	    if (list == null) {
	        list = new ListNode(data);
	    } else {
	        head.next = appendRecursive(head.next, data);
	    }
	    return list;
	}	
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}