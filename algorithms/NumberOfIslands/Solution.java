class Solution {
    public int numIslands(char[][] grid) {
        LinkedList<Integer[]> stack = new LinkedList<Integer[]>();
        int count = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    stack.push(new Integer[]{i, j});
                }
                
                while (stack.size() > 0) {
                    Integer[] pos = stack.pop();
                    int x = pos[0],
                        y = pos[1];
                    grid[x][y] = '0';
                    
                    if (x > 0 && grid[x - 1][y] == '1')
                        stack.push(new Integer[]{x - 1, y});
                    if (x < grid.length - 1 && grid[x + 1][y] == '1')
                        stack.push(new Integer[]{x + 1, y});
                    if (y > 0 && grid[x][y - 1] == '1')
                        stack.push(new Integer[]{x, y - 1});
                    if (y < grid[0].length - 1 && grid[x][y + 1] == '1')
                        stack.push(new Integer[]{x, y + 1});
                }
            }
        }
        
        return count;
    }
}