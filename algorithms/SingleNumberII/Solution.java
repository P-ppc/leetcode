class Solution {
    public int singleNumber(int[] nums) {
        int[] bitMap = new int[32];
        int res = 0;
        
        for (int i = 0; i < 32; i++) {
            for (int num : nums) {
                bitMap[i] += num >> i & 1;
            }
            
            res |= bitMap[i] % 3 << i;
        }
        
        return res;
    }
}