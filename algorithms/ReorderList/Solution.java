/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;
        
        LinkedList<ListNode> stack = new LinkedList<ListNode>(),
                             reversedStack = new LinkedList<ListNode>();
        int length = 0;
        
        while (head != null) {
            stack.addFirst(head);
            reversedStack.addLast(head);
            length++;
            head = head.next;
        }
        
        ListNode p = new ListNode(-1);
        
        for (int i = 0; i < length; i++) {
            p.next = i % 2 == 0 ? reversedStack.pop() : stack.pop();
            p = p.next;
            p.next = null;
        }
    }
}