class Solution {
    public int[][] imageSmoother(int[][] M) {
        if (M.length == 0) return M;
        
        int[][] res = new int[M.length][M[0].length];
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                List<Integer> points =  new ArrayList<Integer>();
                points.add(M[i][j]);
                
                if (j >= 1) {
                    points.add(M[i][j - 1]);
                }
                if (j + 1 < M[0].length) {
                    points.add(M[i][j + 1]);
                }
                if (i >= 1) {
                    points.add(M[i - 1][j]);
                    if (j >= 1) {
                        points.add(M[i - 1][j - 1]);
                    }
                    if (j + 1 < M[0].length) {
                        points.add(M[i - 1][j + 1]);
                    }
                }
                if (i + 1 < M.length) {
                    points.add(M[i + 1][j]);
                    if (j >= 1) {
                        points.add(M[i + 1][j - 1]);
                    }
                    if (j + 1 < M[0].length) {
                        points.add(M[i + 1][j + 1]);
                    }
                }
                
                int pointsSum = 0;
                for (int point : points) {
                    pointsSum += point;
                }
                res[i][j] = pointsSum / points.size();
            }
        }
        return res;
    }
}