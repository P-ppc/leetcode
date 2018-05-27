class Solution(object):
    def maxAreaOfIsland(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        max_area = 0
        dfs_map = {}
        for i in range(0, len(grid)):
            for j in range(0, len(grid[0])):
                if grid[i][j] == 1 and dfs_map.get(str(i) + 'X' + str(j)) == None:
                    stack = [{ 'i': i, 'j': j }]
                    area = 0
                    while len(stack) > 0:
                        point = stack.pop()
                        i = point['i']
                        j = point['j']
                        if dfs_map.get(str(i) + 'X' + str(j)) == 1:
                            continue
                        else:
                            area += 1
                            dfs_map[str(i) + 'X' + str(j)] = 1
                            
                        if i >= 1 and grid[i - 1][j] == 1:
                            stack.append({ 'i': i - 1, 'j': j })
                        if i + 1 < len(grid) and grid[i + 1][j] == 1:
                            stack.append({ 'i': i + 1, 'j': j })
                        if j >= 1 and grid[i][j - 1] == 1:
                            stack.append({ 'i': i, 'j': j - 1 })
                        if j + 1 < len(grid[0]) and grid[i][j + 1] == 1:
                            stack.append({ 'i': i, 'j': j + 1 })
                    max_area = max(max_area, area)         
        return max_area