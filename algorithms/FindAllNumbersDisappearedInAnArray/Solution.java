class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i <= nums.length; i++) {
            res.add(i);
        }
        
        for (int num : nums) {
            res.set(num, 0);
        }
        
        Iterator iterator = res.iterator();
        while (iterator.hasNext()) {
            if ((int) iterator.next() == 0) {
                iterator.remove();
            }
        }
        
        return res;
    }
}