class Solution {
    public int[] singleNumber(int[] nums) {
        int temp = 0,
            res0 = 0,
            res1 = 0;
        
        for (int num : nums) {
            temp ^= num;
        }
        int v = temp & -temp;
        
        for (int num : nums) {
            if ((v & num) == v) {
                res0 ^= num;
            } else {
                res1 ^= num;
            }
        }
        
        return new int[]{res0, res1};
    }
}