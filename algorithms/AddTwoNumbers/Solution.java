/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        int carry = 0;
        
        while (l1 != null && l2 != null) {
            int val = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            p.next = new ListNode(val);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        ListNode remainder = l1 != null ? l1 : l2;
        while (remainder != null) {
            int val = (remainder.val + carry) % 10;
            carry = (remainder.val + carry) / 10;
            p.next = new ListNode(val);
            p = p.next;
            remainder = remainder.next;
        }

        if (carry == 1)
            p.next = new ListNode(carry);

        return dummy.next;
    }
}