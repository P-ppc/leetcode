# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return None
        
        length = 0
        tail = node = head
        while node:
            length += 1
            tail, node = node, node.next
        
        pre = head
        node = pre.next
        i = 1
        while i < length and node.next:
            pre.next = node.next
            node.next = None
            tail.next = node
            tail = tail.next
            pre = pre.next
            node = pre.next
            i += 2
        return head
            