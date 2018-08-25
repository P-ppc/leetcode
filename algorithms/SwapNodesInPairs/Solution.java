/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0),
                 p = dummy;
        dummy.next = head;
        
        while (p.next != null && p.next.next != null) {
            ListNode temp = p.next;
            p.next = p.next.next;
            temp.next = p.next.next;
            p.next.next = temp;
            p = p.next.next;
        }
        
        return dummy.next;
    }
}