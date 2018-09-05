class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1,
            high = nums.length - 1;
        
        while (low < high) {
            int mid = (low + high) / 2,
                count = 0;
            
            for (int n : nums)
                count += n <= mid ? 1 : 0;
            
            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}