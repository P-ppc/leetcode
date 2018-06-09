class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        Character lastCharacter = null;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int start = 0,
            end = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (lastCharacter == null || lastCharacter.equals(S.charAt(i))) {
                end = i;
            } else {
                if (end - start + 1 >= 3) {
                    List<Integer> group = new ArrayList<Integer>();
                    group.add(start);
                    group.add(end);
                    res.add(group);
                }
                end = start = i;
            }
            lastCharacter = S.charAt(i);
        }
        
        if (end - start + 1 >= 3) {
            List<Integer> group = new ArrayList<Integer>();
            group.add(start);
            group.add(end);
            res.add(group);
        }
        return res;
    }
}