class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = -1,
            secondMaxIndex = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (maxIndex == -1) maxIndex = i;
            else if (nums[i] >= nums[maxIndex]) {
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (nums[maxIndex] > nums[i] && (secondMaxIndex == -1 || nums[i] >= nums[secondMaxIndex])) {
                secondMaxIndex = i;
            }
        }
        
        if (secondMaxIndex != -1 && nums[maxIndex] < nums[secondMaxIndex] * 2) {
            return -1;
        }
        
        return maxIndex;
    }
}