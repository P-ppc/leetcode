/**
 * @param {string[]} list1
 * @param {string[]} list2
 * @return {string[]}
 */
var findRestaurant = function(list1, list2) {
    let res = [],
        resturantMap = {},
        minIndexSum = Number.MAX_VALUE
    
    for (let i = 0; i < list1.length; i++) {
        resturantMap[list1[i]] = i
    }
    
    for (let i = 0; i < list2.length; i++) {
        if (resturantMap[list2[i]] !== undefined) {
            let indexSum = resturantMap[list2[i]] + i
            if (indexSum < minIndexSum) {
                res = [list2[i]]
                minIndexSum = indexSum
            } else if (indexSum === minIndexSum) {
                res.push(list2[i])
            }
        }
    }
    
    return res
};