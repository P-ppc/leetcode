class NumArray {
    Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
    
    public NumArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            sumMap.put(i, i == 0 ? nums[i] : sumMap.get(i - 1) + nums[i]);
        }    
    }
    
    public int sumRange(int i, int j) {
        return i == 0 ? sumMap.get(j) : sumMap.get(j) - sumMap.get(i - 1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */