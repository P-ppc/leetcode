/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let nums1Copy = []
    for (let i = 0; i < m; i++) {
        nums1Copy.push(nums1[i])
    }
    
    let i = j = 0
        
    while (i < m && j < n) {
        nums1[i + j] = Math.min(nums1Copy[i], nums2[j])
        if (nums1Copy[i] <= nums2[j]) i++
        else j++
    }
    
    while (i < m) {
        nums1[i + j] = nums1Copy[i]
        i++
    }
    
    while (j < n) {
        nums1[i + j] = nums2[j]
        j++
    }
};