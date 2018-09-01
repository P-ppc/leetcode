/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy.next,
                 pre = cur;
        
        while (cur != null) {
            if (cur.val < pre.val) {
                ListNode next = cur.next;
                pre.next = next;
                
                ListNode p1 = dummy,
                         p2 = p1.next;
                
                while (p2.val < cur.val) {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                cur.next = p2;
                p1.next = cur;
                
                cur = next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        
        return dummy.next;
    }
}