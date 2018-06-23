class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int low = 0,
            high = A.length - 1,
            res = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (A[mid] < A[mid - 1]) {
                high = mid - 1;
            } else if (A[mid] < A[mid + 1]) {
                low = mid + 1;
            } else {
                res = mid;
                break;
            }
        }
        
        return res;
    }
}