class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][2],
                directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        int directionIndex = 0,
            i = 0,
            maxStep = 1,
            curStep = 0;
        
        while (i < R * C) {
            if (0 <= r0 && r0 < R && 0 <= c0 && c0 < C)
                res[i++] = new int[]{r0, c0};
            
            if (curStep == maxStep)
                directionIndex = (directionIndex + 1) % 4;
            else if (curStep == maxStep * 2) {
                directionIndex = (directionIndex + 1) % 4;
                maxStep++;
                curStep = 0;
            }
            
            r0 += directions[directionIndex][0];
            c0 += directions[directionIndex][1];
            curStep++;
        }
        
        return res;
    }
}