class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1)
            return nums[0];
        
        int[] dp1 = new int[length],
              dp2 = new int[length];
        
        for (int i = 0; i < length - 1; i++) {
            dp1[i] = Math.max(nums[i] + (i > 1 ? dp1[i - 2] : 0), i > 0 ? dp1[i - 1] : 0);
            dp2[i] = Math.max(nums[i + 1] + (i > 1 ? dp2[i - 2] : 0), i > 0 ? dp2[i - 1] : 0);
        }
        
        return length > 1 ? Math.max(dp1[length - 2], dp2[length - 2]) : 0;
    }
}