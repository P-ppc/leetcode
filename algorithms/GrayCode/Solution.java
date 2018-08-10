class Solution {
    public List<Integer> grayCode(int n) {
        // or 1 << n
        int length = (int) Math.pow(2, n);
        List<Integer> res = new ArrayList<Integer>();
        
        for (int i = 0; i < length; i++) {
            res.add(i ^ (i >> 1));
        }
        return res;
    }
}