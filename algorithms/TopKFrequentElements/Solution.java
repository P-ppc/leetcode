class Solution {
    class Frequency {
        int value;
        int frequency;
        
        Frequency(int value, int frequency) {
            this.value = value;
            this.frequency = frequency;
        }
    }
        
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (frequencyMap.get(num) == null)
                frequencyMap.put(num, 1);
            else
                frequencyMap.put(num, frequencyMap.get(num) + 1);
        }
        
        Comparator<Frequency> frequencyComparator = new Comparator<Frequency>() {
            public int compare(Frequency a, Frequency b) {
                return a.frequency > b.frequency ? -1 : (a.frequency == b.frequency ? 0 : 1);
            }
        };
        Queue<Frequency> queue = new PriorityQueue<Frequency>(frequencyComparator);
        for (int key : frequencyMap.keySet()) {
            queue.add(new Frequency(key, frequencyMap.get(key)));
        }
        
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < k; i++)
            res.add(queue.poll().value);
        return res;
    }
}