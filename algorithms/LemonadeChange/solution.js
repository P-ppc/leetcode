/**
 * @param {number[]} bills
 * @return {boolean}
 */
var lemonadeChange = function(bills) {
    let remains = {
        5: 0,
        10: 0
    }
    
    for (let i = 0; i < bills.length; i++) {
        let bill = bills[i]
        
        if (bill === 5) {
            remains[5]++
        } else if (bill === 10) {
            if (remains[5] > 0) {
                remains[5]--
                remains[10]++
            } else {
                return false
            }
        } else if (bill === 20) {
            if (remains[10] > 0 && remains[5] > 0) {
                remains[5]--
                remains[10]--
            } else if (remains[5] >= 3) {
                remains[5] -= 3
            } else {
                return false
            }
        }
    }
    
    return true
};