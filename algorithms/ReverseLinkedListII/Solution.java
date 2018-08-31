/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;
            
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        dummy.next = head;
        
        for (int i = 0; i < m - 1; i++) pre = pre.next;
        
        ListNode reverse = null,
                 cur = pre.next;
        
        for (int i = 0; i < n - m + 1; i++) {
            ListNode next = cur.next;
            cur.next = reverse;
            reverse = cur;
            cur = next;
        }
        
        pre.next.next = cur;
        pre.next = reverse;
        return dummy.next;
    }
}