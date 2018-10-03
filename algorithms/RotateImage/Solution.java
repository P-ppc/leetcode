class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length,
            i = 0;
        
        while (i < n / 2) {
            int x = i,
                y = i;
            
            while (y < n - 1 - i) {
                matrix[x][y] += matrix[y][n - 1 -x];
                matrix[y][n - 1 -x] = matrix[x][y] - matrix[y][n - 1 -x];
                matrix[x][y] -= matrix[y][n - 1 -x];

                matrix[x][y] += matrix[n - 1 - x][n - 1 - y];
                matrix[n - 1 - x][n - 1 - y] = matrix[x][y] - matrix[n - 1 - x][n - 1 - y];
                matrix[x][y] -= matrix[n - 1 - x][n - 1 - y];

                matrix[x][y] += matrix[n - 1 - y][x];
                matrix[n - 1 - y][x] = matrix[x][y] - matrix[n - 1 - y][x];
                matrix[x][y] -= matrix[n - 1 - y][x];

                y++;
            }
            i++;
        }
    }
}