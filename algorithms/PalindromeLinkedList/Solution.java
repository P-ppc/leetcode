/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int length = 0,
            index = 0;
        ListNode p = head;
        
        while (p != null) {
            length++;
            p = p.next;
        }
        
        p = null;
        
        while (index < length / 2) {
            index++;
            ListNode temp = p;
            p = head;
            head = head.next;
            p.next = temp;
        }
        
        if (length % 2 == 1) {
            head = head.next;
        }
        
        while (p != null && head != null) {
            if (p.val != head.val) {
                return false;
            } else {
                p = p.next;
                head = head.next;
            }
        }
        return true;
    }
}