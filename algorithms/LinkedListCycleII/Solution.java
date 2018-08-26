/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        
        ListNode fast = head,
                 slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow) {
                ListNode p = slow.next;
                int i = 1;
                
                while (p != slow) {
                    p = p.next;
                    i++;
                }
                
                ListNode tail = head;
                for (int j = 0; j < i; j++) {
                    tail = tail.next;
                }
                
                while (head != tail) {
                    head = head.next;
                    tail = tail.next;
                }
                return head;
            }
        }
        
        return null;
    }
}