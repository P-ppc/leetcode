/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        int length = 0;
        ListNode p = root,
                 pre = root;
        
        while (p != null) {
            p = p.next;
            length++;
        }
        
        int quotient = length / k,
            remainder = length % k;
        
        p = root;
        
        int i = 0,
            j = 0;
        
        while (p != null) {
            if (i++ == 0)
                res[j++] = p;
            
            pre = p;
            p = p.next;
            
            if (remainder > 0 && i == quotient + 1) {
                remainder--;
                pre.next = null;
                i = 0;
            } else if (remainder == 0 && i == quotient) {
                pre.next = null;
                i = 0;
            }
        }
        
        return res;
    }
}