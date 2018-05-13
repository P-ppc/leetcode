class MyQueue {
    List<Integer> stack = new ArrayList<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int value = peek();
        this.stack.remove(0);
        return value;
    }
    
    /** Get the front element. */
    public int peek() {
        if (empty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return stack.get(0);
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */