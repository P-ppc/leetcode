class Solution {
    public int arrangeCoins(int n) {
        int low = 0,
            high = n;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sum = (mid + 1L) * mid / 2;

            if (sum < n) {
                low = mid + 1;
            } else if (sum > n) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return high;
    }
}