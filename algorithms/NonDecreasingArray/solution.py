class Solution(object):
    def checkPossibility(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        parts = []
        part = []
        
        for i in range(len(nums)):
            part.append(nums[i])
            if i + 1 < len(nums) and nums[i + 1] < nums[i]:
                parts.append(part)
                part = []
        
        if len(part) > 0:
            parts.append(part)
        
        if len(parts) <= 1:
            return True
        elif len(parts) == 2:
            left = parts[0]
            right = parts[1]
            
            if len(left) == 1 or len(right) == 1:
                return True
            elif right[1] >= left[-1] or right[0] >= left[-2]:
                return True
            else:
                return False
        else:        
            return False
        