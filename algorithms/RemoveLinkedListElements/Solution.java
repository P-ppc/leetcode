/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode res = null,
                 cur = null;
        
        while (head != null) {
            if (head.val != val) {
                if (res == null) {
                    cur = res = new ListNode(head.val);
                } else {
                    cur = cur.next = new ListNode(head.val);
                }
            }
            head = head.next;
        }
        
        return res;
    }
}