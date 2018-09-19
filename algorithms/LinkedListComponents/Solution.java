/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        // this solution use O(n) time and O(n) space
        int length = 0;
        ListNode p = head;
        
        while (p != null) {
            p = p.next;
            length++;
        }
        
        int[] buckets = new int[length];
        
        for (int val : G)
            buckets[val] = 1;
        
        int count = 0;
        boolean flag = false;
        while (head != null) {
            if (buckets[head.val] == 1) {
                if (!flag) {
                    count++;
                    flag = true;
                }
            } else {
                flag = false;
            }
            head = head.next;
        }
        
        return count;
    }
}