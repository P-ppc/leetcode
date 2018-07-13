class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[Math.max(n, 2)];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                for (int j = i * 2; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }
        
        return count;
    }
}