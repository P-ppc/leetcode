class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> res = new ArrayList<Integer>();
        int carry = 1;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            res.add(0, sum % 10);
            carry = sum / 10;
        }
        
        if (carry == 1) {
            res.add(0, 1);
        }
        
        int[] resArray = new int[res.size()];
        for (int i = res.size() - 1; i >= 0; i--) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }
}