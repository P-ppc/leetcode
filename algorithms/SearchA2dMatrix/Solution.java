class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = m == 0 ? 0 : matrix[0].length;
        if (m == 0 || n == 0)
            return false;

        int low = 0,
            high = m - 1,
            rowIndex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (matrix[mid][n - 1] < target)
                low = mid + 1;
            else if (matrix[mid][0] > target)
                high = mid - 1;
            else {
                rowIndex = mid;
                break;
            }
        }
        if (rowIndex == -1)
            return false;

        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (matrix[rowIndex][mid] < target)
                low = mid + 1;
            else if (matrix[rowIndex][mid] > target)
                high = mid - 1;
            else
                return true;
        }

        return false;
    }
}