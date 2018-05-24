# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """        
        res = None
        head = None
        while l1 and l2:
            if res == None:
                res = ListNode(min(l1.val, l2.val))
                head = res
            else:
                head.next = ListNode(min(l1.val, l2.val))
                head = head.next
            if l1.val <= l2.val:
                l1 = l1.next
            else:
                l2 = l2.next
        if l1 and res:
            head.next = l1
        elif l2 and res:
            head.next = l2
        elif l1 and not res:
            res = l1
        elif l2 and not res:
            res = l2
        return res