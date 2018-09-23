class Solution {
    public int findPeakElement(int[] nums) {
        int length = nums.length;
        int low = 0,
            high = length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2,
                // be careful of overflow for nums[mid] - 1
                leftVal = mid > 0 ? nums[mid - 1] : Integer.MIN_VALUE,
                rightVal = mid < length - 1 ? nums[mid + 1] : Integer.MIN_VALUE;
            
            if (nums[mid] < leftVal)
                high = mid - 1;
            else if (nums[mid] < rightVal)
                low = mid + 1;
            else
                return mid;
        }
        
        return -1;
    }
}