class Solution {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        
        for (int i = 0; i <= num; i++) {
            if (i == 0 || i == 1)
                dp[i] = i;
            else if (i % 2 == 0)
                dp[i] = dp[i >> 1];
            else
                dp[i] = dp[i - 1] + 1;
        }
        
        return dp;
    }
}