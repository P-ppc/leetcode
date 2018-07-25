class MyLinkedList(object):
    
    class LinkedList(object):
        
        def __init__(self, x):
            self.val = x
            self.next = None            
        

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.length = 0
        self.head = MyLinkedList.LinkedList(-1)

    def get(self, index):
        """
        Get the value of the index-th node in the linked list. If the index is invalid, return -1.
        :type index: int
        :rtype: int
        """
        if index < 0 or index >= self.length:
            return -1
        cur = self.head.next
        
        for i in range(index):
            cur = cur.next
        return cur.val

    def addAtHead(self, val):
        """
        Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
        :type val: int
        :rtype: void
        """
        self.addAtIndex(0, val)

    def addAtTail(self, val):
        """
        Append a node of value val to the last element of the linked list.
        :type val: int
        :rtype: void
        """
        self.addAtIndex(self.length, val)

    def addAtIndex(self, index, val):
        """
        Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
        :type index: int
        :type val: int
        :rtype: void
        """
        if 0 <= index <= self.length:
            node = MyLinkedList.LinkedList(val)
            pre = self.head
            cur = pre.next
            i = 0
            while cur and i < index:
                pre = cur
                cur = cur.next
                i += 1
            node.next = cur
            pre.next = node
            self.length += 1

    def deleteAtIndex(self, index):
        """
        Delete the index-th node in the linked list, if the index is valid.
        :type index: int
        :rtype: void
        """
        if 0 <= index < self.length:
            pre = self.head
            cur = pre.next
            i = 0
            while i < index:
                pre = cur
                cur = cur.next
                i += 1
            pre.next = cur.next
            self.length -= 1


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)