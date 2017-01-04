/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode smallerHead = new ListNode(0);
        ListNode smaller = smallerHead;
        ListNode biggerHead = new ListNode(0);
        ListNode bigger = biggerHead;
        
        while(head != null) {
            if(head.val < x) {
                smaller.next = head;
                smaller = smaller.next;

            }else {
                bigger.next = head;
                bigger = bigger.next;
            }
                head = head.next;            
        }
        bigger.next = null;
        smaller.next = biggerHead.next;
        return smallerHead.next;
    }
}