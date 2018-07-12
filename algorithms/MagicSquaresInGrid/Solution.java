class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int res = 0,
            rowLength = grid.length,
            colLength = grid[0].length;
        
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (i + 2 < rowLength && j + 2 < colLength && isMagicSquare(new int[]{i, j}, grid)) res++;
            }
        }
        
        return res;
    }
    
    public boolean isMagicSquare(int[] base, int[][] grid) {
        int[] array = new int[9];
    
        for (int i = base[0]; i <= base[0] + 2; i++) {
            for (int j = base[1]; j <= base[1] + 2; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9) {
                    return false;
                } else if (array[grid[i][j] - 1] == 1) {
                    return false;
                }
                array[grid[i][j] - 1] = 1;
            }
        }

        if (grid[base[0]][base[1]] + grid[base[0]][base[1] + 1] + grid[base[0]][base[1] + 2] != 15) return false;
        else if (grid[base[0] + 1][base[1]] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 1][base[1] + 2] != 15) return false;
        else if (grid[base[0] + 2][base[1]] + grid[base[0] + 2][base[1] + 1] + grid[base[0] + 2][base[1] + 2] != 15) return false;
        else if (grid[base[0]][base[1]] + grid[base[0] + 1][base[1]] + grid[base[0] + 2][base[1]] != 15) return false;
        else if (grid[base[0]][base[1] + 1] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 2][base[1] + 1] != 15) return false;
        else if (grid[base[0]][base[1] + 2] + grid[base[0] + 1][base[1] + 2] + grid[base[0] + 2][base[1] + 2] != 15) return false;
        else if (grid[base[0]][base[1]] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 2][base[1] + 2] != 15) return false;
        else if (grid[base[0]][base[1] + 2] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 2][base[1]] != 15) return false;

        return true;
    }
}