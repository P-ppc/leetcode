class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        max_area = 0
        start = 0
        end = len(height) - 1
        
        while start < end:
            max_area = max(max_area, min(height[start], height[end]) * (end - start))
            if height[start] < height[end]:
                start += 1
            else:
                end -= 1
        
        return max_area