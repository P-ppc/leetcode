class Solution(object):
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()
        self.backtrack(nums, [], res)
        return res
    
    def backtrack(self, nums, temp, res):
        if len(nums) == 0:
            res.append(temp)
        else:
            i = 0
            while i < len(nums):
                num = nums[i]
                temp_nums = nums[:]
                temp_nums.remove(num)
                t = temp[:]
                t.append(num)
                self.backtrack(temp_nums, t, res)
                
                while i + 1 < len(nums) and nums[i + 1] == num:
                    i += 1
                i += 1