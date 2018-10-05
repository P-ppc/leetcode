class Solution {
    public int findMin(int[] nums) {
        int low = 0,
            high = nums.length - 1;
        
        while (low < high - 1) {
            int mid = (low + high) / 2;
            
            if (nums[mid] < nums[high])
                high = mid;
            else if (nums[mid] > nums[high])
                low = mid;
        }
        
        return Math.min(nums[low], nums[high]);
    }
}