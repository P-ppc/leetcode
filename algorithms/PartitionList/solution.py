# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        dummy_smaller = ListNode(-1)
        dummy_bigger = ListNode(-1)
        p_smaller = dummy_smaller
        p_bigger = dummy_bigger
        
        while head:
            p = head
            head = head.next
            p.next = None
            if p.val < x:
                p_smaller.next = p
                p_smaller = p_smaller.next
            else:
                p_bigger.next = p
                p_bigger = p_bigger.next
        
        p_smaller.next = dummy_bigger.next
        return dummy_smaller.next