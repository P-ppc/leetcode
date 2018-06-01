/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseListRecursively(null, head);
    }
    
    public ListNode reverseListRecursively(ListNode pre, ListNode cur) {
        if (cur == null) return null;
        if (cur.next == null) {
            cur.next = pre;
            return cur;
        }
        
        ListNode next = cur.next;
        cur.next = pre;
        return reverseListRecursively(cur, next);
    }
}