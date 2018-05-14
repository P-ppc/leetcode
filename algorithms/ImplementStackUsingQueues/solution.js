/**
 * Initialize your data structure here.
 */
var MyStack = function() {
    this.queue = []
};

/**
 * Push element x onto stack. 
 * @param {number} x
 * @return {void}
 */
MyStack.prototype.push = function(x) {
    this.queue.push(x)
};

/**
 * Removes the element on top of the stack and returns that element.
 * @return {number}
 */
MyStack.prototype.pop = function() {
    let value = this.top()
    this.queue.length = this.queue.length - 1
    return value
};

/**
 * Get the top element.
 * @return {number}
 */
MyStack.prototype.top = function() {
    if (this.empty()) {
        throw new RangeError('This stack is empty')
    }
    return this.queue[this.queue.length - 1]
};

/**
 * Returns whether the stack is empty.
 * @return {boolean}
 */
MyStack.prototype.empty = function() {
    return this.queue.length === 0
};

/** 
 * Your MyStack object will be instantiated and called as such:
 * var obj = Object.create(MyStack).createNew()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */