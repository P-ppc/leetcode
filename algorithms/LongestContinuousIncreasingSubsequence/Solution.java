class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 0;
        List<Integer> curSequence = new ArrayList<Integer>();
        
        for (int num : nums) {
            if (curSequence.size() > 0 && num <= curSequence.get(curSequence.size() - 1)) {
                curSequence.clear(); 
            }
            curSequence.add(num);
            maxLength = Math.max(maxLength, curSequence.size());
        }
        return maxLength;
    }
}