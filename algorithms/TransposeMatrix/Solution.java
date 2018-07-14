class Solution {
    public int[][] transpose(int[][] A) {
        int[][] res = new int[A[0].length][A.length];
        
        for (int j = 0; j < A[0].length; j++) {
            for (int i = 0; i < A.length; i++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}