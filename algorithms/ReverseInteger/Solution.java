class Solution {
    public int reverse(int x) {
        int res = 0,
            MAX_INTEGER_BOUNDARY = Integer.MAX_VALUE / 10,
            MIN_INTEGER_BOUNDARY = Integer.MIN_VALUE / 10;
        
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            
            if (res > MAX_INTEGER_BOUNDARY || (res == MAX_INTEGER_BOUNDARY && pop > 7)) return 0;
            if (res < MIN_INTEGER_BOUNDARY || (res == MIN_INTEGER_BOUNDARY && pop < -8)) return 0;
            
            res = res * 10 + pop;
        }
        
        return res;
    }
}