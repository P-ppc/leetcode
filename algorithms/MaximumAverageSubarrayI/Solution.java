class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0,
            curSum = 0,
            preIndex = -k;
        
        for (int num : nums) {
            if (preIndex < 0) {
                curSum += num;
                maxSum = curSum;
                preIndex++;
            } else {
                curSum += num - nums[preIndex++];
                maxSum = Math.max(maxSum, curSum);
            }
        }

        return maxSum * 1.0d / k;
    }
}