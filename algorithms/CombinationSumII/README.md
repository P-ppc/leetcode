# Combination Sum II
We can solve this proble by Backtracking Algorithm like [Combination Sum](./CombinationSum), the better solution is like below:
```java
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backTrack(0, candidates, new ArrayList<Integer>(), target, res);
        return res;
    }
    
    public void backTrack(int beg, int[] candidates, List<Integer> temp, int target, List<List<Integer>> res) {
        if (target == 0) {
            res.add(temp);
        } else {
            int i = beg;
            while (i < candidates.length) {
                int c = candidates[i];
                if (c <= target) {
                    List<Integer> t = new ArrayList<Integer>(temp);
                    t.add(c);
                    backTrack(i + 1, candidates, t, target - c, res);
                    while (i + 1 < candidates.length && candidates[i + 1] == c) {
                        i++;
                    }
                }
                i++;
            }
        }
    }
}
```