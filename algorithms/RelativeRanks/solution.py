class Solution(object):
    def findRelativeRanks(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        max_score = 0
        res = len(nums) * [0]
        
        for num in nums:
            max_score = max(max_score, num)
        
        score_map = (max_score + 1) * [-1]
        
        for i in range(len(nums)):
            num = nums[i]
            score_map[num] = i
        
        count = 1
        end = len(score_map) - 1
        while end >= 0:
            if score_map[end] != -1:
                if count == 1:
                    res[score_map[end]] = 'Gold Medal'
                elif count == 2:
                    res[score_map[end]] = 'Silver Medal'
                elif count == 3:
                    res[score_map[end]] = 'Bronze Medal'
                else:
                    res[score_map[end]] = str(count)
                count += 1
            end -= 1
        
        return res