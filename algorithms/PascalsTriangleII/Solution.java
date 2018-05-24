class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        res.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) temp.add(res.get(j));
                else if (j == res.size()) temp.add(res.get(j - 1));
                else temp.add(res.get(j - 1) + res.get(j));
            }
            res = temp;
            temp = new ArrayList<Integer>();
        }
        return res;        
    }
}