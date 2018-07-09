class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length,
            beg = -1,
            end = -2,
            min = nums[length - 1],
            max = nums[0];
        
        for (int i = 0; i < length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[length - 1 - i]);

            if(nums[i] < max) end = i;
            if(nums[length - 1 - i] > min) beg = length - 1 - i;
        }
        return end - beg + 1;
    }
}