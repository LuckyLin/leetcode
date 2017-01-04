/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode res = new ListNode(0);
        ListNode tmp = res, p1 = l1, p2 = l2;
        int carry = 0;

        while(l1 != null || l2 != null) {
        	
        	if(l1 != null){
        		carry += l1.val;
        		l1 = l1.next;
        	}

        	if(l2 != null) {
        		carry += l2.val;
        		l2 = l2.next;
        	}
			
        	tmp.next = new ListNode(carry % 10);
        	carry = carry / 10;
        	tmp = tmp.next;
        }

        if(carry == 1) {
        	tmp.next = new ListNode(1);
        }
        return res.next;
    }
}