class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int m = matrix.length;
        if (m == 0) return res;
        
        int n = matrix[0].length,
            i = 0,
            j = 0,
            topLimit = 0,
            leftLimit = 0,
            bottomLimit = m - 1,
            rightLimit = n - 1,
            xDirection = 1,
            yDirection = 0;
        
        for (int c = 0; c < m * n; c++) {
            res.add(matrix[i][j]);

            if (j + xDirection > rightLimit) {
                topLimit = i + 1;
                xDirection = 0;
                yDirection = 1;
            } else if (i + yDirection > bottomLimit) {
                rightLimit = j - 1;
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
        
        return res;
    }
}