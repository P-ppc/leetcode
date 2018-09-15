/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int length = 0;
        ListNode p = head,
                 tail = head;
        
        while (p != null) {
            tail = p;
            p = p.next;
            length++;
        }
        
        if (length == 0 || k % length == 0)
            return head;
        
        k %= length;
        tail.next = head;
        p = head;
        
        for (int i = 0; i++ < length - k - 1;)
            p = p.next;
        
        ListNode temp = p.next;
        p.next = null;
        return temp;
    }
}