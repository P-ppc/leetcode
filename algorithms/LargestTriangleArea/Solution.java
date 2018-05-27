class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0d;
        for (int[] point1 : points) {
            for (int[] point2 : points) {
                for (int[] point3 : points) {
                    int a = point1[0],
                        b = point1[1],
                        c = point2[0],
                        d = point2[1],
                        e = point3[0],
                        f = point3[1];
                    
                    maxArea = Math.max(maxArea, (double) Math.abs(a * d + b * e + c * f - a * f - b * c - d * e) / 2);
                }
            }
        }
        
        return maxArea;
    }
}