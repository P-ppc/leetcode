# Combination Sum
We can solve this proble by Backtracking Algorithm, the better solution is like below:
```java
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backTrack(0, candidates, new ArrayList<Integer>(), target, res);
        return res;
    }
    
    public void backTrack(int beg, int[] candidates, List<Integer> temp, int target, List<List<Integer>> res) {
        if (target == 0) {
            res.add(temp);
        } else {
            for (int i = beg; i < candidates.length; i++) {
                int c = candidates[i];
                if (c <= target) {
                    List<Integer> t = new ArrayList<Integer>(temp);
                    t.add(c);
                    backTrack(i, candidates, t, target - c, res);
                }
            }
        }
    }
}
```