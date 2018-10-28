class Solution {
    class MaxHeap {
        ArrayList<Integer> heap;
        
        MaxHeap() {
            heap = new ArrayList<Integer>();
        }
        
        void push(int value) {
            heap.add(value);
            int pos = heap.size() - 1;
            int pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2;
            
            while (pPos >= 0 && value > heap.get(pPos)) {
                heap.set(pos, heap.get(pPos));
                heap.set(pPos, value);
                pos = pPos;
                pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2;
            }
        }
        
        int size() {
            return heap.size();
        }
        
        int pop() {
            int size = heap.size();
            if (size == 0)
                throw new ArrayIndexOutOfBoundsException("pop from empty list");
            else if (size == 1)
                return heap.remove(0);
            
            int value = heap.get(0);
            heap.set(0, heap.remove(size - 1));
            int pos = 0;
            int maxChildPos = pos * 2 + 2;
            if (maxChildPos < size - 1)
                maxChildPos = heap.get(maxChildPos) > heap.get(maxChildPos - 1) ? maxChildPos : maxChildPos - 1;
            else
                maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos;
            
            while (maxChildPos < size - 1 && heap.get(pos) < heap.get(maxChildPos)) {
                int temp = heap.get(maxChildPos);
                heap.set(maxChildPos, heap.get(pos));
                heap.set(pos, temp);
                pos = maxChildPos;
                maxChildPos = pos * 2 + 2;
                
                if (maxChildPos < size - 1)
                    maxChildPos = heap.get(maxChildPos) > heap.get(maxChildPos - 1) ? maxChildPos : maxChildPos - 1;
                else
                    maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos;
            }
            
            return value;
        }
    }
    
    public int findKthLargest(int[] nums, int k) {
        MaxHeap maxHeap = new MaxHeap();
        for (int num : nums)
            maxHeap.push(num);
        for (int i = 0; i < k - 1; i++)
            maxHeap.pop();
        return maxHeap.pop();
    }
}