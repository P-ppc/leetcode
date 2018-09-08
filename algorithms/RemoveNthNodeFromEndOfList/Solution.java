/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1),
                 p1 = dummy,
                 p2 = dummy;
        
        dummy.next = head;
        
        for (int i = 0; i <= n; i++)
            p2 = p2.next;
            
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        p1.next = p1.next.next;
        return dummy.next;
    }
}