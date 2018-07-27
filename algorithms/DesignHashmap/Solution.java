// java case have 0 input
class MyHashMap {
    Integer[] buckets;
    /** Initialize your data structure here. */
    public MyHashMap() {
        buckets = new Integer[1000000];
        Arrays.fill(buckets, null);
    }
    
    /** value will always be positive. */
    public void put(int key, int value) {
        this.buckets[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return this.buckets[key] == null ? -1 : this.buckets[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        this.buckets[key] = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */