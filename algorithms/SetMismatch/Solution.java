class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Boolean> valueMap = new HashMap<Integer, Boolean>();
        
        for (int num : nums) {
            if (valueMap.get(num) == null) {
                valueMap.put(num, true);
            } else {
                res[0] = num;
            }
        }
        
        for (int i = 1; i <= nums.length; i++) {
            if (valueMap.get(i) == null) {
                res[1] = i;
            }
        }
        
        return res;
    }
}