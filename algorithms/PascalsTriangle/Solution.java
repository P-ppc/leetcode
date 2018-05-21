class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            if (i > 0) {
                List<Integer> lastRow = res.get(res.size() - 1);
                for (int j = 0; j < lastRow.size(); j++) {
                    if (j + 1 < lastRow.size()) {
                        row.add(lastRow.get(j) + lastRow.get(j + 1));
                    } else {
                        row.add(lastRow.get(j));
                    }
                }
            }
            res.add(row);
        }
        return res;
    }
}