class Solution {
    public int binaryGap(int N) {
        int maxGap = 0,
            pre = -1;
        
        for (int i = 0; i < 32; i++) {
            if (((N >> i) & 1) == 1) {
                maxGap = pre == -1 ? 0 : Math.max(maxGap, i - pre);
                pre = i;
            }
        }
        
        return maxGap;
    }
}