# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(-1)
        p = dummy
        carry = 0
        
        while l1 and l2:
            val = (l1.val + l2.val + carry) % 10
            carry = (l1.val + l2.val + carry) / 10
            p.next = ListNode(val)
            p = p.next
            l1 = l1.next
            l2 = l2.next
        
        remainder = l1 if l1 else l2
        
        while remainder:
            val = (remainder.val + carry) % 10
            carry = (remainder.val + carry) / 10
            p.next = ListNode(val)
            p = p.next
            remainder = remainder.next
        
        if carry:
            p.next = ListNode(carry)
        
        return dummy.next