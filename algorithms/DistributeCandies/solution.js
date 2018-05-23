/**
 * @param {number[]} candies
 * @return {number}
 */
var distributeCandies = function(candies) {
    let candyKinds = new Set(candies)
    return candyKinds.size > candies.length / 2 ? candies.length / 2 : candyKinds.size
};