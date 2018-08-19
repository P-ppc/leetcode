/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        
        int length = 0;
        ListNode tail = head,
                 node = head;
        
        while (node != null) {
            length++;
            tail = node;
            node = node.next;
        }
        
        ListNode pre = head;
        int i = 1;
        node = pre.next;
        
        while (i < length && node.next != null) {
            pre.next = node.next;
            node.next = null;
            tail.next = node;
            tail = tail.next;
            pre = pre.next;
            node = pre.next;
            i += 2;
        }
        
        return head;
    }
}