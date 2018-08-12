class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        backTrack(0, s, new ArrayList<String>(), res);
        return res;
    }
    
    public void backTrack(int beg, String s, List<String> temp, List<List<String>> res) {
        if (beg == s.length()) {
            res.add(temp);
        } else {
            for (int i = beg; i < s.length(); i++) {
                String part = s.substring(beg, i + 1);
                if (part.equals(new StringBuilder(part).reverse().toString())) {
                    List<String> t = new ArrayList<String>(temp);
                    t.add(part);
                    backTrack(i + 1, s, t, res);
                }
            }
        }
    }
}