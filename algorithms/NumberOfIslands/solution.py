class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        stack = []
        count = 0
        
        for i in xrange(len(grid)):
            for j in xrange(len(grid[0])):
                if grid[i][j] == '1':
                    count += 1
                    stack.append((i, j))
                
                while len(stack) > 0:
                    x, y = stack.pop()
                    grid[x][y] = '-1'
                    if x > 0 and grid[x - 1][y] == '1':
                        stack.append((x - 1, y))
                    if x < len(grid) - 1 and grid[x + 1][y] == '1':
                        stack.append((x + 1, y))
                    if y > 0 and grid[x][y - 1] == '1':
                        stack.append((x, y - 1))
                    if y < len(grid[0]) - 1 and grid[x][y + 1] == '1':
                        stack.append((x, y + 1))
                
        return count