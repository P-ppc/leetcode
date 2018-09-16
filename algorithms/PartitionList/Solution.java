/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummySmaller = new ListNode(-1),
                 dummyBigger = new ListNode(-1);
        
        ListNode pSmaller = dummySmaller,
                 pBigger = dummyBigger;
        
        while (head != null) {
            ListNode p = head;
            head = head.next;
            p.next = null;
            
            if (p.val < x) {
                pSmaller.next = p;
                pSmaller = p;
            } else {
                pBigger.next = p;
                pBigger = p;
            }
        }
        
        pSmaller.next = dummyBigger.next;
        return dummySmaller.next;
    }
}