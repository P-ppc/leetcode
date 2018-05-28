class Solution {
    public boolean isHappy(int n) {
        Map<Integer, Boolean> sumMap = new HashMap<Integer, Boolean>();
        sumMap.put(n, true);
        
        while (n != 1) {
            int sum = 0;
            while (n >= 10) {
                sum += (int) Math.pow(n % 10, 2);
                n /= 10;
            }
            sum += (int) Math.pow(n, 2);
            n = sum;
            
            if (sumMap.get(sum) != null) {
                return false;
            } else {
                sumMap.put(sum, true);
            }
        }
        
        return true;
    }
}