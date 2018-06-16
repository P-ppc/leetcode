# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        length = 0
        p = head
        # get the length of linked list
        while p:
            length += 1
            p = p.next
        
        # reverse the half of the linked list
        index = 0
        p = None
        while index < length / 2:
            index += 1
            p, head, p.next = head, head.next, p
            
        if length % 2 == 1:
            head = head.next
            
        # compare the two linked list
        while p and head:
            if p.val != head.val:
                return False
            else:
                p = p.next
                head = head.next
        
        return True
        