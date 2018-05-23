class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int colLength = matrix[0].length;
            for (int j = 0; j < colLength; j++) {
                if (0 <= i - 1 && 0 <= j - 1 && j - 1 < colLength && matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}