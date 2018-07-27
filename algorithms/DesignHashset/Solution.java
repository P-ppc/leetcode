class MyHashSet {
    int[] buckets;
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        buckets = new int[1000000];
    }
    
    public void add(int key) {
        buckets[key] = 1;
    }
    
    public void remove(int key) {
        buckets[key] = 0;
    }
    
    /** Returns true if this set did not already contain the specified element */
    public boolean contains(int key) {
        return buckets[key] == 1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */