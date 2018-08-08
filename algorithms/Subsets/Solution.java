class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backTrack(0, nums, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void backTrack(int beg, int[] nums, List<Integer> temp, List<List<Integer>> res) {
        if (beg <= nums.length) {
            res.add(temp);
            for (int i = beg; i < nums.length; i++) {
                List<Integer> t = new ArrayList<Integer>(temp);
                t.add(nums[i]);
                backTrack(i + 1, nums, t, res);
            }
        }
    }
}