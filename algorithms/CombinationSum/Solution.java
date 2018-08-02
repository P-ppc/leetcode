class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            for(int c : candidates) {
                if (c <= target) {
                    List<Integer> temp = new ArrayList<Integer>(a);
                    temp.add(c);
                    backTrack(candidates, temp, target - c, t);
                }
            }
        }
    }
}