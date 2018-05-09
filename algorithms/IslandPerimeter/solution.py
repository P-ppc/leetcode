class Solution(object):
    def islandPerimeter(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        perimeter = 0
        for i in range(0, len(grid)):
            for j in range(0, len(grid[i])):
                if grid[i][j] == 0:
                    continue
                perimeter += 4
                if i - 1 >= 0 and grid[i - 1][j] == 1:
                    perimeter -= 2
                if j - 1 >= 0 and grid[i][j - 1] == 1:
                    perimeter -= 2
        return perimeter