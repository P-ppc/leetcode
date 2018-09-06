class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int i = 0,
            j = 0,
            topLimit = 0,
            leftLimit = 0,
            bottomLimit = n - 1,
            rightLimit = n - 1,
            xDirection = 1,
            yDirection = 0;

        for (int v = 1, max = (int) Math.pow(n, 2); v <= max; v++) {
            matrix[i][j] = v;

            if (j + xDirection > rightLimit) {
                topLimit = i + 1;
                xDirection = 0;
                yDirection = 1;
            } else if (i + yDirection > bottomLimit) {
                rightLimit = i - 1;
                xDirection = -1;
                yDirection = 0;
            } else if (j + xDirection < leftLimit) {
                bottomLimit = i - 1;
                xDirection = 0;
                yDirection = -1;
            } else if (i + yDirection < topLimit) {
                leftLimit = j + 1;
                xDirection = 1;
                yDirection = 0;
            }

            i += yDirection;
            j += xDirection;
        }
        return matrix;
    }
}