/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode dummy = new RandomListNode(-1);
        RandomListNode d = dummy,
                       p = head;
        Map<RandomListNode, RandomListNode> nodeMap = new HashMap<RandomListNode, RandomListNode>();
        
        while (p != null) {
            d.next = new RandomListNode(p.label);
            nodeMap.put(p, d.next);
            d = d.next;
            p = p.next;
        }
        
        d = dummy.next;
        while (head != null) {
            d.random = head.random != null ? nodeMap.get(head.random) : null;
            d = d.next;
            head = head.next;
        }
        
        return dummy.next;
    }
}