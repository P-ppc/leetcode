class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_counts = []
        for num in nums:
            if len(max_counts) == 0:
                max_counts.append(num)
            elif len(max_counts) == 1:
                max_counts.append(max(num, max_counts[0]))
            else:
                max_counts.append(max(num + max_counts[-2], max_counts[-1]))
        
        return 0 if len(max_counts) == 0 else max(max_counts)