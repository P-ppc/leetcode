class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0,
            high = num;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midPower = 1L * mid * mid;
            
            if (midPower > num) {
                high = mid - 1;
            } else if (midPower < num) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        
        return false;
    }
}