class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        res = 0
        length = len(nums)
        nums.sort()
        
        i = j = 0
        while j < length and i < length:
            if i >= j:
                j += 1
            elif nums[j] - nums[i] == k:
                res += 1
                temp = nums[i]
                while i < length and temp == nums[i]:
                    i += 1
            elif nums[j] - nums[i] > k:
                i += 1
            elif nums[j] - nums[i] < k:
                j += 1
            
        return res