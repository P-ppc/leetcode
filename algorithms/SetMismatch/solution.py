class Solution(object):
    def findErrorNums(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = []
        value_map = {}
        
        for num in nums:
            if value_map.get(num) == None:
                value_map[num] = True
            else:
                res.append(num)
                
        for i in range(1, len(nums) + 1):
            if value_map.get(i) == None:
                res.append(i)
        return res