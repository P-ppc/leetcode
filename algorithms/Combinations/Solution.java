class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backTrack(1, n, k, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void backTrack(int beg, int n, int k, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == k) {
            res.add(temp);
        } else {
            for (int i = beg; i <= n; i++) {
                List<Integer> t = new ArrayList<Integer>(temp);
                t.add(i);
                backTrack(i + 1, n, k, t, res);
            }
        }
    }
}