class MyStack {
    List<Integer> queue = new ArrayList<Integer>();
    
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);    
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int value = top();
        queue.remove(queue.size() - 1);
        return value;
    }
    
    /** Get the top element. */
    public int top() {
        if (empty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return queue.get(queue.size() - 1);
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */