/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head) {
        Node dummy = new Node(-1, null, null, null);
        Node p = dummy;
        
        while (head != null) {
            p.next = new Node(head.val, p, null, null);
            if (head.child != null) {
                p.next.next = flatten(head.child);
                p.next.next.prev = p.next;
            }
            head = head.next;
            while (p.next != null)
                p = p.next;
        }
        
        p = dummy.next;
        if (p != null)
            p.prev = null;
        return p;
    }
}