/**
 * initialize your data structure here.
 */
var MinStack = function() {
    this.stack = []
    this.min = null
};

/** 
 * @param {number} x
 * @return {void}
 */
MinStack.prototype.push = function(x) {
    this.stack.push(x)
    this.min = Math.min(...this.stack)
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    this.stack.pop()
    if (this.stack.length === 0) {
        this.min = null    
    } else {
        this.min = Math.min(...this.stack)
    }   
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    let value = this.stack[this.stack.length - 1]
    return value === undefined ? null : value
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
    return this.min
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = Object.create(MinStack).createNew()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */