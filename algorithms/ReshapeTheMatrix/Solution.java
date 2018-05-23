class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0 || nums[0].length == 0 || nums.length * nums[0].length != r * c) {
            return nums;
        }
        
        int[][] reshapedMatrix = new int[r][c];
        int rowIndex = 0,
            colIndex = 0; 
        for (int[] row : nums) {
            for (int value : row) {
                reshapedMatrix[rowIndex][colIndex] = value;
                if (colIndex + 1 == c) {
                    rowIndex++;
                    colIndex = 0;
                } else {
                    colIndex++;
                }
            }
        }
        return reshapedMatrix;
    }
}