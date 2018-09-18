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
        int carry = 0;
        LinkedList<ListNode> stack1 = new LinkedList<ListNode>(),
                             stack2 = new LinkedList<ListNode>();
        
        while (l1 != null) {
            stack1.push(l1);
            l1 = l1.next;
        }
        
        while (l2 != null) {
            stack2.push(l2);
            l2 = l2.next;
        }
        
        while (stack1.size() > 0 && stack2.size() > 0) {
            ListNode node1 = stack1.pop(),
                     node2 = stack2.pop(),
                     temp = dummy.next;
            
            int val = (node1.val + node2.val + carry) % 10;
            carry = (node1.val + node2.val + carry) / 10;
            dummy.next = new ListNode(val);
            dummy.next.next = temp;
        }
        
        LinkedList<ListNode> stack = stack1.size() > 0 ? stack1 : stack2;
        
        while (stack.size() > 0) {
            ListNode node = stack.pop(),
                     temp = dummy.next;
            
            int val = (node.val + carry) % 10;
            carry = (node.val + carry) / 10;
            dummy.next = new ListNode(val);
            dummy.next.next = temp;
        }
        
        if (carry == 1) {
            ListNode temp = dummy.next;
            dummy.next = new ListNode(carry);
            dummy.next.next = temp;
        }
        
        return dummy.next;
    }
}