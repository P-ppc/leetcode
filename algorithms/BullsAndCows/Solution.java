class Solution {
    public String getHint(String secret, String guess) {
        int bullCount = 0,
            cowCount = 0;
        Map<Character, Integer> valueMap = new HashMap<Character, Integer>();
        List<Character> guessRemains = new ArrayList<Character>();
        
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i))
                bullCount++;
            else {
                if (valueMap.get(secret.charAt(i)) == null)
                    valueMap.put(secret.charAt(i), 1);
                else
                    valueMap.put(secret.charAt(i), valueMap.get(secret.charAt(i)) + 1);
                guessRemains.add(guess.charAt(i));
            }
        }
        
        for (int i = 0; i < guessRemains.size(); i++) {
            char c = guessRemains.get(i);
            Integer v = valueMap.get(c);
            if (v != null && v > 0) {
                cowCount++;
                valueMap.put(c, v - 1);
            }
        }
        
        return String.format("%dA%dB", bullCount, cowCount);
    }
}