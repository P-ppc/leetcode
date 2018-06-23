class Solution {
    public int mySqrt(int x) {
        double cur = (double) x,
            prev = 0.0d;

        do {
            prev = cur;
            cur = (cur + x / cur) / 2;
        } while (Math.abs(cur - prev) > 0.00001);
        
        return (int) prev;
    }
}