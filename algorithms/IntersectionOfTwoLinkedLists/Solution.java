/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA,
                 p2 = headB;
        
        int length1 = 0,
            length2 = 0;
        
        while (p1 != null) {
            length1++;
            p1 = p1.next;
        }
        
        while (p2 != null) {
            length2++;
            p2 = p2.next;
        }
        
        while (length1 > length2) {
            headA = headA.next;
            length1--;
        }
        
        while (length2 > length1) {
            headB = headB.next;
            length2--;
        }
        
        while (headA != null) {
            if (headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        
        return null;
    }
}