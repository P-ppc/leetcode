/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode p = head;
        int length = 0;
        
        while (p != null) {
            length++;
            p = p.next;
        }
        if (length > 1) quickSort(head, length);
        return head;
    }
    
    public void quickSort(ListNode head, int length) {
        ListNode pre = head,
                 cur = head.next;
        
        int preIndex = 0,
            key = head.val;
        
        for (int i = 1; i < length; i++) {
            if (cur.val <= key) {
                if (pre.next.val > key) {
                    int temp = pre.next.val;
                    pre.next.val = cur.val;
                    cur.val = temp;
                }
                pre = pre.next;
                preIndex++;
            }
            cur = cur.next;
        }
        int temp = pre.val;
        pre.val = key;
        head.val = temp;
        
        if (preIndex > 1) quickSort(head, preIndex);
        if (length - 1 - preIndex > 1) quickSort(pre.next, length - 1 - preIndex);
    }
}