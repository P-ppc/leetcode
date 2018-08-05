class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backTrack(nums, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void backTrack(int[] nums, List<Integer> temp, List<List<Integer>> res) {
        int length = nums.length;
        if (length == 0) {
            res.add(temp);
        } else {
            for (int i = 0; i < length; i++) {
                int num = nums[i];
                int[] tempNums = new int[length - 1];
                System.arraycopy(nums, 0, tempNums, 0, i);
                System.arraycopy(nums, i + 1, tempNums, i, length - 1 - i);
                List<Integer> t = new ArrayList<Integer>(temp);
                t.add(num);
                backTrack(tempNums, t, res);
            }
        }
    }
}