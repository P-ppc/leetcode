class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<String> temp = new ArrayList<String>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backTrack(candidates, new ArrayList<Integer>(), target, temp);
        for (String s : temp) {
            List<Integer> t = new ArrayList<Integer>();
            for (String c : s.split(",")) {
                t.add(Integer.valueOf(c));
            }
            res.add(t);
        }
        return res;
    }
    
    public void backTrack(int[] candidates, List<Integer> a, int target, List<String> t) {
        if (target == 0) {
            Collections.sort(a);
            List<String> l = new ArrayList<String>();
            for (Integer i : a) {
                l.add(String.valueOf(i));
            }
            String s = String.join(",", l);
            if (!t.contains(s)) {
                t.add(s);
            }
        } else {
            for (int i = 0; i < candidates.length; i++) {
                int c = candidates[i];
                if (c <= target) {
                    List<Integer> temp = new ArrayList<Integer>(a);
                    temp.add(c);
                    int[] tempCandidates = new int[candidates.length - 1];
                    System.arraycopy(candidates, 0, tempCandidates, 0, i);
                    System.arraycopy(candidates, i + 1, tempCandidates, i, candidates.length - 1 - i);
                    backTrack(tempCandidates, temp, target - c, t);
                }
            }
        }
    }
}