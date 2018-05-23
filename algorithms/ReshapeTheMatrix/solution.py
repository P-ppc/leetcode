class Solution(object):
    def matrixReshape(self, nums, r, c):
        """
        :type nums: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        if len(nums) == 0 or len(nums[0]) == 0 or len(nums) * len(nums[0]) != r * c:
            return nums
        
        transformed_nums = []
        line = []
        for row in nums:
            for value in row:
                if len(line) + 1 == c:
                    line.append(value)
                    transformed_nums.append(line)
                    line = []
                else:
                    line.append(value)
        return transformed_nums
            