class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backTrack("", n, n, res);
        return res;
    }
    
    public void backTrack(String s, int left, int right, List<String> res) {
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if (left > 0) {
            backTrack(s + "(", left - 1, right, res);
        }
        if (left < right) {
            backTrack(s + ")", left, right - 1, res);
        }
    }
}