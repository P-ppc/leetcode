class Solution {
    public int minPathSum(int[][] grid) {
        int rowLength = grid.length,
            colLength = grid[0].length;
        
        int[][] dp = new int[rowLength][colLength];
        
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (i == 0 && j == 0) dp[i][j] = grid[i][j];
                else if (i == 0 && j > 0) dp[i][j] = grid[i][j] + dp[i][j - 1];
                else if (i > 0 && j == 0) dp[i][j] = grid[i][j] + dp[i - 1][j];
                else dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[rowLength - 1][colLength - 1];
    }
}