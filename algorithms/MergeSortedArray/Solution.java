class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);
        
        int i = 0, j = 0;
        while (i < m && j < n) {
            nums1[i + j] = Math.min(nums1Copy[i], nums2[j]);
            if (nums1Copy[i] <= nums2[j]) i++;
            else j++;
        }
        
        while (i < m) {
            nums1[i + j] = nums1Copy[i];
            i++;
        }
        
        while (j < n) {
            nums1[i + j] = nums2[j];
            j++;
        }
    }
}