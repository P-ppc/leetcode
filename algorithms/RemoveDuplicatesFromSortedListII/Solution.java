/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head,
                 tempNode = null;
        
        head = null;
        while (node != null) {
            boolean hasDuplicate = false;
            while (node.next != null && node.val == node.next.val) {
                hasDuplicate = true;
                node = node.next;
            }
            if (hasDuplicate == false) {
                if (tempNode == null) {
                    tempNode = new ListNode(node.val);
                    head = tempNode;
                } else {
                    tempNode.next = new ListNode(node.val);
                    tempNode = tempNode.next;
                }
            }
            node = node.next;
        }
        return head;
    }
}