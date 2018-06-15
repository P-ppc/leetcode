class Solution {
    public int minCostClimbingStairs(int[] cost) {
        List<Integer> minCosts = new ArrayList<Integer>();
        
        for (int c : cost) {
            int size = minCosts.size();
            
            if (size < 2) {
                minCosts.add(c);
            } else {
                minCosts.add(c + Math.min(minCosts.get(size - 2), minCosts.get(size - 1)));
            }
        }
        int size = minCosts.size();
        return size < 2 ? 0 : Math.min(minCosts.get(size - 2), minCosts.get(size - 1));
    }
}