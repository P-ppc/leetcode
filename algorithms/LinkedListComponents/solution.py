# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def numComponents(self, head, G):
        """
        :type head: ListNode
        :type G: List[int]
        :rtype: int
        """
        count = 0
        flag = False
        
        while head:
            if head.val in G:
                if not flag:
                    count += 1
                    flag = True
            else:
                flag = False
            head = head.next
        
        return count