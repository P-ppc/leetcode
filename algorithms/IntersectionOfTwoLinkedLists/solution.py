# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        p1 = headA
        p2 = headB
        
        length1 = 0
        length2 = 0
        
        while p1:
            length1 += 1
            p1 = p1.next
            
        while p2:
            length2 += 1
            p2 = p2.next
            
        while length1 > length2:
            headA = headA.next
            length1 -= 1
        
        while length2 > length1:
            headB = headB.next
            length2 -= 1
        
        while headA:
            if headA == headB:
                return headA
            else:
                headA = headA.next
                headB = headB.next