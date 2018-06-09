class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        // use long to avoid the overflow
        long step = 5;
        
        while (step <= n) {
            count += (n / step);
            step *= 5;
        }
        return count;
    }
}