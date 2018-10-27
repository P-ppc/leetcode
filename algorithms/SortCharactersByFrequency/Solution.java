class Solution {
    class MaxHeap {
        class Node {
            Object item;
            int priority;
            
            Node(Object item, int priority) {
                this.item = item;
                this.priority = priority;
            }
        }
        
        ArrayList<Node> heap;
        MaxHeap() {
            this.heap = new ArrayList<Node>();;
        }
        
        void push(Object item, int priority) {
            heap.add(new Node(item, priority));
            int pos = heap.size() - 1;
            int pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2;
            
            while (pPos >= 0 && priority > heap.get(pPos).priority) {
                Node temp = heap.get(pPos);
                heap.set(pPos, heap.get(pos));
                heap.set(pos, temp);
                pos = pPos;
                pPos = (pos % 2 == 0 ? pos - 2 : pos - 1) / 2;
            }
        }
        
        int size() {
            return heap.size();
        }
        
        Object pop() {
            int size = heap.size();
            if (size == 0)
                throw new ArrayIndexOutOfBoundsException("pop from empty list");
            else if (size == 1)
                return heap.remove(0).item;
            
            Object item = heap.get(0).item;
            int pos = 0;
            int maxChildPos = pos * 2 + 2;
            heap.set(0, heap.remove(size - 1));
            
            if (maxChildPos < size - 1)
                maxChildPos = heap.get(maxChildPos).priority > heap.get(maxChildPos - 1).priority ? maxChildPos : maxChildPos - 1;
            else
                maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos;
            
            while (maxChildPos < size - 1 && heap.get(pos).priority < heap.get(maxChildPos).priority) {
                Node temp = heap.get(maxChildPos);
                heap.set(maxChildPos, heap.get(pos));
                heap.set(pos, temp);
                pos = maxChildPos;
                maxChildPos = pos * 2 + 2;
                
                if (maxChildPos < size - 1)
                    maxChildPos = heap.get(maxChildPos).priority > heap.get(maxChildPos - 1).priority ? maxChildPos : maxChildPos - 1;
                else
                    maxChildPos = maxChildPos - 1 < size - 1 ? maxChildPos - 1 : pos;
            }
            
            return item;
        }
    }
    
    public String frequencySort(String s) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (charMap.get(c) == null)
                charMap.put(c, 1);
            else
                charMap.put(c, charMap.get(c) + 1);
        }
        
        MaxHeap maxHeap = new MaxHeap();
        for (char c : charMap.keySet())
            maxHeap.push(c, charMap.get(c));
        
        StringBuilder sb = new StringBuilder();
        while (maxHeap.size() > 0) {
            char c = (char) maxHeap.pop();
            for (int i = 0; i < charMap.get(c); i++)
                sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
}