class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        
        int res = 0,
            length = nums.length,
            i = 0,
            j = 0;
        
        Arrays.sort(nums);
        
        while (i < length && j < length) {
            if (i >= j) {
                j++;
            } else if (nums[j] - nums[i] == k) {
                res++;
                int temp = nums[i];
                while (i < length && temp == nums[i]) {
                    i++;
                }
            } else if (nums[j] - nums[i] > k) {
                i++;
            } else if (nums[j] - nums[i] < k) {
                j++;
            }
        }
        
        return res;
    }
}