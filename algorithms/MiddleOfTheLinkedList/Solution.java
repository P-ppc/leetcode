/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode p = head;
        
        while (p != null) {
            p = p.next;
            length++;
        }
        p = head;
        
        for (int i = 0; i < length / 2; i++) {
            p = p.next;
        }
        return p;
    }
}