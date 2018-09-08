# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode(-1)
        dummy.next = head
        
        p1 = dummy
        p2 = dummy
        
        for i in xrange(n + 1):
            p2 = p2.next
            
        while p2:
            p1 = p1.next
            p2 = p2.next
            
        p1.next = p1.next.next
        
        return dummy.next