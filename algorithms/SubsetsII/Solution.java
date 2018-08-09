class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backTrack(0, nums, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void backTrack(int beg, int[] nums, List<Integer> temp, List<List<Integer>> res) {
        if (beg <= nums.length) {
            res.add(temp);
            int i = beg;
            while (i < nums.length) {
                int num = nums[i];
                List<Integer> t = new ArrayList<Integer>(temp);
                t.add(num);
                backTrack(i + 1, nums, t, res);
                
                while (i + 1 < nums.length && nums[i + 1] == num) {
                    i++;
                }
                
                i++;
            }
        }
    }
}