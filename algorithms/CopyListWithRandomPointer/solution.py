# Definition for singly-linked list with a random pointer.
# class RandomListNode(object):
#     def __init__(self, x):
#         self.label = x
#         self.next = None
#         self.random = None

class Solution(object):
    def copyRandomList(self, head):
        """
        :type head: RandomListNode
        :rtype: RandomListNode
        """
        dummy = RandomListNode(-1)
        d = dummy
        node_map = {}
        p = head
        
        while p:
            d.next = RandomListNode(p.label)
            node_map[p] = d.next
            p = p.next
            d = d.next
        
        d = dummy.next
        while head:
            d.random = node_map[head.random] if head.random else None
            d = d.next
            head = head.next
            
        return dummy.next