/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    let nums1Map = {},
        res = []
    nums1.forEach(num => {
        if (nums1Map[num] === undefined) {
            nums1Map[num] = true
        }
    })
    
    nums2.forEach(num => {
        if (nums1Map[num] === true) {
            delete nums1Map[num]
            res.push(num)
        }
    })
    
    return res
};