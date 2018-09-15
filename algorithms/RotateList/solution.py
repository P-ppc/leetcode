# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        length = 0
        p = head
        tail = p
        while p:
            tail = p
            p = p.next
            length += 1
        
        if length == 0 or k % length == 0:
            return head
        k %= length
        tail.next = head
        
        p = head
        for i in xrange(length - k -1):
            p = p.next
        
        temp = p.next
        p.next = None
        
        return temp