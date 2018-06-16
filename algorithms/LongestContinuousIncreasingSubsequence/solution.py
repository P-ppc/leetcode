class Solution(object):
    def findLengthOfLCIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_length = 0
        cur_sequence = []
        for num in nums:
            if len(cur_sequence) == 0:
                cur_sequence = [num]
            elif num > cur_sequence[-1]:
                cur_sequence.append(num)
            else:
                cur_sequence = [num]
                
            max_length = max(max_length, len(cur_sequence))
        
        return max_length