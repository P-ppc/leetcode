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
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        int length = 0;
        ListNode p = head;
        
        while (p != null) {
            p = p.next;
            length++;
        }
        return help(head, length);
    }
    
    public TreeNode help(ListNode head, int length) {
        if (length == 0) return null;
        
        ListNode p = head;
        int mid = length / 2;
        
        for (int i = 0; i < mid; i++) p = p.next;
        
        TreeNode root = new TreeNode(p.val);
        root.left = help(head, mid);
        root.right = help(p.next, length - mid - 1);
        return root;
    }
}