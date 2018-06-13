class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE,
            curSum = Integer.MIN_VALUE;
        
        for (int num : nums) {
            if (curSum >= 0 && curSum + num >= 0) {
                curSum += num;
            } else {
                curSum = num;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        
        return maxSum;
    }
}