# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        res = None
        cur = None
        
        while head:
            if head.val != val:
                if not res:
                    res = ListNode(head.val)
                    cur = res
                else:
                    cur.next = ListNode(head.val)
                    cur = cur.next
            head = head.next
        
        return res
        