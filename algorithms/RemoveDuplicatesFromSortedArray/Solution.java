class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int pre = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i != pre && nums[i] != nums[pre]) {
                nums[++pre] = nums[i];
            }
        }
        
        return pre + 1;
    }
}