class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        start = 0
        end = len(numbers) - 1
        res = []
        
        while start < end:
            value = numbers[start] + numbers[end]
            if value == target:
                res = [start + 1, end + 1]
                break
            elif value > target:
                end = end - 1
            else:
                start = start + 1
        
        return res