class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) continue;
            for (int j = i; j < length; j++) {
                if (nums[j] != 0) {
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                    break;
                }
            }
        }
    }
}