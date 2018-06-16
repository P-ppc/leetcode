class Solution {
    public int rob(int[] nums) {
        List<Integer> maxCounts = new ArrayList<Integer>();
        for (int num : nums) {
            int size = maxCounts.size();
            if (size == 0) {
                maxCounts.add(num);
            } else if (size == 1) {
                maxCounts.add(Math.max(num, maxCounts.get(0)));
            } else {
                maxCounts.add(Math.max(maxCounts.get(size - 2) + num, maxCounts.get(size - 1)));
            }
        }
        
        return maxCounts.size() > 0 ? Collections.max(maxCounts) : 0;
    }
}