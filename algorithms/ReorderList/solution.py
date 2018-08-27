# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reorderList(self, head):
        """
        :type head: ListNode
        :rtype: void Do not return anything, modify head in-place instead.
        """
        if not head: return None
        
        reverse_sequence = []
        while head:
            reverse_sequence.append(head)
            head = head.next
        
        sequence = reverse_sequence[::-1]
        length = len(sequence)
        
        p = ListNode(-1)
        for i in xrange(length):
            p.next = sequence.pop() if i % 2 == 0 else reverse_sequence.pop()
            p = p.next
            p.next = None
        