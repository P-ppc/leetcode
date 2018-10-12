class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] reverses = new int[length];
    
        for (int i = 0; i < length; i++)
            reverses[length - 1 - i] = i == 0 ? nums[length - 1 - i] : nums[length - 1 - i] * reverses[length - i];
        for (int i = 0; i < length; i++)
            nums[i] = i == 0 ? nums[i] : nums[i] * nums[i - 1];

        reverses[0] = reverses[1];
        for (int i = 1; i < length - 1; i++)
            reverses[i] = nums[i - 1] * reverses[i + 1];
        reverses[length - 1] = nums[length - 2];

        return reverses;
    }
}