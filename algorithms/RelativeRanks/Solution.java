class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int maxScore = 0;
        String[] res = new String[nums.length];
        
        for (int num : nums) {
            maxScore = Math.max(maxScore, num);
        }
        
        Integer[] scoreMap = new Integer[maxScore + 1];
        
        for (int i = 0; i < nums.length; i++) {
            scoreMap[nums[i]] = i;
        }
        
        int count = 1;
        for (int i = scoreMap.length - 1; i >= 0; i--) {
            if (scoreMap[i] != null) {
                if (count == 1) {
                    res[scoreMap[i]] = "Gold Medal";
                } else if (count == 2) {
                    res[scoreMap[i]] = "Silver Medal";
                } else if (count == 3) {
                    res[scoreMap[i]] = "Bronze Medal";
                } else {
                    res[scoreMap[i]] = String.valueOf(count);
                }
                count++;
            }
        }
        
        return res;
    }
}