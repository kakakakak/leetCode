import java.util.*;


/**
 *author:chenyi
 *Add Two Numbers
 *You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 *Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *Output: 7 -> 0 -> 8
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class Solution2 {
		
	//loop everyone

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if(l1 == null && l2 != null)
			return l2;

		if(l2 == null && l1 != null) 
			return l1;

		ListNode result = new ListNode(0);
		if(l2 == null && l1 == null) 
			return result;

		ListNode start = result;
		
		int tmp = 0;
		while( l1 != null || l2 != null || tmp != 0){
			
			if( l1 != null ){
				tmp += l1.val;
				l1 = l1.next;
			}
			
			if( l2 != null ){
				tmp += l2.val;
				l2 = l2.next;
			}
			
			result.next = new ListNode(0);
			result = result.next;
			result.val = tmp % 10;
			tmp = tmp / 10;
		}
		return start.next;
  	}
}


