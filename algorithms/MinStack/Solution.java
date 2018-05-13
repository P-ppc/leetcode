class MinStack {
    List<Integer> stack = new ArrayList<Integer>();
    Object min = null;
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        stack.add(x);
        min = (int) Collections.min(stack);
    }
    
    public void pop() {
        int size = stack.size();
        if (size > 0) {
            stack.remove(size - 1);    
        }
        if (size - 1 > 0) {
            min = (int) Collections.min(stack);
        } else {
            min = null;
        }
    }
    
    public int top() {
        int size = stack.size();
        if (size > 0) {
            return stack.get(size - 1);
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public int getMin() {
        if (min == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */