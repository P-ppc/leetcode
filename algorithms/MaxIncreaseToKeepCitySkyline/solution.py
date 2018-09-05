class Solution(object):
    def maxIncreaseKeepingSkyline(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        length = len(grid)
        
        top_skyline = []
        left_skyline = []
        
        for i in xrange(length):
            left_skyline.append(max(grid[i]))
            
            skyline = 0
            for j in xrange(length):
                skyline = max(skyline, grid[j][i])
            top_skyline.append(skyline)
        
        count = 0
        for i in xrange(length):
            for j in xrange(length):
                count += min(left_skyline[i], top_skyline[j]) - grid[i][j]
                
        return count