class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> valueMap = new HashMap<Integer, Integer>();
        List<Integer> stack =  new ArrayList<Integer>();
        
        for (int num : nums2) {
            int value;
            while (stack.size() > 0 && (value = stack.get(stack.size() - 1)) < num) {
                stack.remove(stack.size() - 1);
                valueMap.put(value, num);
            }
            stack.add(num);
        }
        
        while (stack.size() > 0) {
            valueMap.put(stack.get(stack.size() - 1), -1);
            stack.remove(stack.size() - 1);
        }
        
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = valueMap.get(nums1[i]);
        }
        return res;
    }
}