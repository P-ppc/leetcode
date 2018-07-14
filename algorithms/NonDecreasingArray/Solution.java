class Solution {
    public boolean checkPossibility(int[] nums) {
        List<List<Integer>> parts = new ArrayList<List<Integer>>();
        List<Integer> part = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            part.add(nums[i]);
            if (i + 1 < nums.length && nums[i + 1] < nums[i]) {
                parts.add(part);
                part = new ArrayList<Integer>();
            }
        }
        
        if (part.size() > 0) {
            parts.add(part);
        }
        
        if (parts.size() <= 1) {
            return true;
        } else if (parts.size() == 2) {
            List<Integer> left = parts.get(0),
                          right = parts.get(1);
            
            if (left.size() == 1 || right.size() == 1) {
                return true;
            } else if (right.get(1) >= left.get(left.size() - 1) || right.get(0) >= left.get(left.size() - 2)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}