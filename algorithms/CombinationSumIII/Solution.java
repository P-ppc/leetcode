class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backTrack(0, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new ArrayList<Integer>(), k, n, res);
        return res;
    }
    
    public void backTrack(int beg, int[] candidates, List<Integer> temp, int k, int target, List<List<Integer>> res) {
        if (temp.size() == k && target == 0) {
            res.add(temp);
        } else if (temp.size() < k) {
            for (int i = beg; i < candidates.length; i++) {
                int c = candidates[i];
                if (c <= target) {
                    List<Integer> t = new ArrayList<Integer>(temp);
                    t.add(c);
                    backTrack(i + 1, candidates, t, k, target - c, res);
                }
            }
        }
    }
}