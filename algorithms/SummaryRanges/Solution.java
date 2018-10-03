class Solution {
    public List<String> summaryRanges(int[] nums) {
        int length = nums.length,
            i = 0,
            j = 0;
        List<String> res = new ArrayList<String>();
        
        if (length == 0)
            return res;
        
        while (j < length) {
            if (j > 0 && nums[j - 1] + 1 < nums[j]) {
                res.add(j - 1 > i ? String.format("%d->%d", nums[i], nums[j - 1]) : String.format("%d", nums[i]));
                i = j;
            }
            j++;
        }
        res.add(j - 1 > i ? String.format("%d->%d", nums[i], nums[j - 1]) : String.format("%d", nums[i]));
        
        return res;
    }
}