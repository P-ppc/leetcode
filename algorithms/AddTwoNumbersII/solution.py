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
        carry = 0
        stack1 = []
        stack2 = []
        
        while l1:
            stack1.append(l1)
            l1 = l1.next
        
        while l2:
            stack2.append(l2)
            l2 = l2.next
        
        while len(stack1) and len(stack2):
            node1 = stack1.pop()
            node2 = stack2.pop()
            val = (node1.val + node2.val + carry) % 10
            carry = (node1.val + node2.val + carry) / 10
            temp = dummy.next
            dummy.next = ListNode(val)
            dummy.next.next = temp
        
        stack = stack1 if len(stack1) else stack2
        while len(stack):
            node = stack.pop()
            val = (node.val + carry) % 10
            carry = (node.val + carry) / 10
            temp = dummy.next
            dummy.next = ListNode(val)
            dummy.next.next = temp
        
        if carry:
            temp = dummy.next
            dummy.next = ListNode(carry)
            dummy.next.next = temp
        
        return dummy.next