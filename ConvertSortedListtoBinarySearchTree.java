/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return toBST(head, null);
    }
    
    public TreeNode toBST(ListNode head, ListNode tail) {
        if(head == tail) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=tail && fast.next!=tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        TreeNode res = new TreeNode(slow.val);
        res.left = toBST(head, slow);
        res.right = toBST(slow.next, tail);
        
        return res;
        
    }
}