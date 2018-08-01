class KthLargest {
    int k;
    PriorityQueue<Integer> queue;
    
    public KthLargest(int k, int[] nums) {
        this.k  = k;
        queue = new PriorityQueue<>();
        if (nums.length <= k) {
            for (int num : nums) queue.add(num);
        } else {
            for (int i = 0; i < k; i++) queue.add(nums[i]);
            for (int i = k; i < nums.length; i++) {
                if (queue.peek() < nums[i]) {
                    queue.poll();
                    queue.add(nums[i]);
                }
            }
        }

    }
    
    public int add(int val) {
        if(queue.size() < k) {
            queue.offer(val);
        } else if(queue.peek() < val) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */