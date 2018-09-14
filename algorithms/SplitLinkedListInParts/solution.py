# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def splitListToParts(self, root, k):
        """
        :type root: ListNode
        :type k: int
        :rtype: List[ListNode]
        """
        res = []
        length = 0
        p = root
    
        while p:
            p = p.next
            length += 1
        
        quotient = length / k
        remainder = length % k
        
        p = root
        pre = p
        i = 0
        
        while p:
            if i == 0:
                res.append(p)
                
            i += 1
            pre = p
            p = p.next
            
            if remainder > 0 and i == quotient + 1:
                remainder -= 1
                pre.next = None
                i = 0
            elif remainder == 0 and i == quotient:
                pre.next = None
                i = 0
        
        while len(res) < k:
            res.append(None)
        
        return res