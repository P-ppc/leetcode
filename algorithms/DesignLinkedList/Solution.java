class MyLinkedList {
    private Node head;
    private int length;
    
    private class Node {
        public int val;
        public Node next;
        
        public Node (int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = new Node(-1);
        this.length = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= this.length) return -1;
    
        Node cur = this.head.next;
        for (int i = 0; i < index; i++) cur = cur.next;
        return cur.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        this.addAtIndex(0, val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        this.addAtIndex(this.length, val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (0 <= index && index <= this.length) {
            Node node = new Node(val),
                pre = this.head,
                cur = this.head.next;
            int i = 0;

            while (cur != null && i++ < index) {
                pre = cur;
                cur = cur.next;
            }

            node.next = cur;
            pre.next = node;
            this.length++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (0 <= index && index < this.length) {
            Node pre = this.head,
                cur = this.head.next;
            int i = 0;

            while (i++ < index) {
                pre = cur;
                cur = cur.next;
            }
            pre.next = cur.next;
            this.length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */