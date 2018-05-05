class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        x = x ^ y;
        while (x > 0) {
            if ((x & 0x01) == 1) {
                count++;
            }
            x = x >> 1;
        }
        return count;
    }
}