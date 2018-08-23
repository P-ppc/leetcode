class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0,
            right = nums.length - 1;
        
        while (left < right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == nums[mid + 1]) {
                if (mid % 2 == 0) left = mid + 1;
                else right = mid - 1;
            } else if (nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) right = mid - 1;
                else left = mid + 1;
            } else {
                return nums[mid];
            }
        }
        
        return nums[left];
    }
}