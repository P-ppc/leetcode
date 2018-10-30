class Solution {
    class Frequency {
        String word;
        int frequency;
        
        Frequency(String word, int frequency) {
            this.word = word;
            this.frequency = frequency;
        }
    }
    
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
        for (String word : words) {
            if (frequencyMap.get(word) == null)
                frequencyMap.put(word, 1);
            else
                frequencyMap.put(word, frequencyMap.get(word) + 1);
        }
        
        Comparator<Frequency> frequencyComparator = new Comparator<Frequency>() {
            public int compare(Frequency a, Frequency b) {
                return a.frequency > b.frequency ? -1 : (a.frequency == b.frequency ? a.word.compareTo(b.word) : 1);
            }
        };
        Queue<Frequency> queue = new PriorityQueue<Frequency>(frequencyComparator);
        for (String word : frequencyMap.keySet()) {
            queue.add(new Frequency(word, frequencyMap.get(word)));
        }
        
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < k; i++)
            res.add(queue.poll().word);
        return res;
    }
}