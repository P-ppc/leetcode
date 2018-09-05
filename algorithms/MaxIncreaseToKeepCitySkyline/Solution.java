class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int length = grid.length,
            count = 0;
        
        int[] topSkyline = new int[length],
              leftSkyline = new int[length];
        
        for (int i = 0; i < length; i++) {
            int skyline = 0;
            for (int j = 0; j < length; j++)
                skyline = Math.max(skyline, grid[i][j]);
            leftSkyline[i] = skyline;
            
            skyline = 0;
            for (int j = 0; j < length; j++)
                skyline = Math.max(skyline, grid[j][i]);
            topSkyline[i] = skyline;
        }
        
        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++)
                count += Math.min(leftSkyline[i], topSkyline[j]) - grid[i][j];
        
        return count;
    }
}