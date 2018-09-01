# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def insertionSortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(-1)
        dummy.next = head
        
        cur = dummy.next
        pre = cur
        
        while cur:
            if cur.val < pre.val:
                # remove cur
                nxt = cur.next
                pre.next = nxt
                
                # insert cur to front
                p1 = dummy
                p2 = p1.next
                while p2.val < cur.val:
                    p1 = p1.next
                    p2 = p2.next
                cur.next = p2
                p1.next = cur
                
                cur = nxt
            else:
                pre = cur
                cur = cur.next
        
        return dummy.next