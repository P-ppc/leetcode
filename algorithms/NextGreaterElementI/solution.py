class Solution(object):
    def nextGreaterElement(self, findNums, nums):
        """
        :type findNums: List[int]
        :type nums: List[int]
        :rtype: List[int]
        """
        value_map = {}
        stack = []
        for num in nums:
            while len(stack) > 0 and stack[-1] < num:
                value = stack.pop()
                value_map[value] = num
            stack.append(num)
                    
        while len(stack) > 0:
            value = stack.pop()
            value_map[value] = -1
        
        return [value_map[x] for x in findNums]
                    