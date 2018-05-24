/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = null,
                 head = null;
        while (l1 != null && l2 != null) {
            if (res == null) {
                head = res = new ListNode(Math.min(l1.val, l2.val));
            } else {
                head.next = new ListNode(Math.min(l1.val, l2.val));
                head = head.next;
            }
            if (l1.val <= l2.val) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
        }
        
        if (res == null) res = l1 != null ? l1 : l2;
        else head.next = l1 != null ? l1 : l2;
        return res;
    }
}