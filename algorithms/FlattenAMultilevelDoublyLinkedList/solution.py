"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, prev, next, child):
        self.val = val
        self.prev = prev
        self.next = next
        self.child = child
"""
class Solution(object):
    def flatten(self, head):
        """
        :type head: Node
        :rtype: Node
        """
        dummy = Node(-1, None, None, None)
        p = dummy
        
        while head:
            p.next = Node(head.val, p, None, None)
            if head.child:
                p.next.next = self.flatten(head.child)
                p.next.next.prev = p.next
            head = head.next
            while p.next:
                p = p.next

        p = dummy.next
        if p: p.prev = None
        return p
        