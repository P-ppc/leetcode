# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def sortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next: return head
        
        fast = head.next
        slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        
        left = head
        right = slow.next
        # break the list
        slow.next = None
        
        left = self.sortList(left)
        right = self.sortList(right)
        return self.merge(left, right)
    
    def merge(self, left, right):
        p = head = ListNode(0)
        
        while left and right:
            node = left if left.val <= right.val else right
            
            if left.val <= right.val: left = left.next
            else: right = right.next
            
            p.next = node
            p = p.next
        
        if left: p.next = left
        elif right: p.next = right
        
        return head.next
        