class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0,
            end = nums.length - 1;
        
        while (start < end) {
            int index = (start + end) / 2,
                mid = nums[index];
            
            if (mid < target) start = index + 1;
            else if (mid > target) end = index - 1;
            else return index;
        }
        
        start = nums[start] < target ? start + 1 : start;
        return start;
    }
}