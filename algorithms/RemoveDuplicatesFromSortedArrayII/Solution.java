class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return 0;

        int count = 0,
            pre = 0;

        for (int i = 1; i < length; i++) {
            if (nums[i] == nums[pre]) {
                count++;
                if (count < 2)
                    nums[++pre] = nums[i];
            } else {
                nums[++pre] = nums[i];
                count = 0;
            }
        }

        return pre + 1;
    }
}