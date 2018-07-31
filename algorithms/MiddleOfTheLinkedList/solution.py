# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def middleNode(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        length = 0
        p = head
        while p:
            p = p.next
            length += 1
        p = head
        for i in xrange(length / 2):
            p = p.next
        return p