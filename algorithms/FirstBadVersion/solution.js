/**
 * Definition for isBadVersion()
 * 
 * @param {integer} version number
 * @return {boolean} whether the version is bad
 * isBadVersion = function(version) {
 *     ...
 * };
 */

/**
 * @param {function} isBadVersion()
 * @return {function}
 */
var solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function(n) {
        let start = 0,
            end = 0
        
        while (start < end) {
            let index = parseInt((start + end) / 2)
            if (isBadVersion(index)) {
                end = index - 1
            } else {
                start = index + 1
            }
        }
        
        return start
    };
};