class Solution {
    public boolean isMonotonic(int[] A) {
        int v = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i])
                v |= 1;
            else if (A[i - 1] < A[i])
                v |= 2;
        }

        return v != 3;
    }
}