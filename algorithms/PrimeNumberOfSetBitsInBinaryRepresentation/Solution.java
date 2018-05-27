class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        
        for (int i = L; i <= R; i++) {
            int oneCount = 0, x = i;
            
            while (x > 1) {
                x &= x - 1;
                oneCount++;
            }
            
            if (oneCount > 1) {
                x = oneCount / 2;
                boolean isPrime = true;
                while (x > 1) {
                    if (oneCount % x == 0) {
                        isPrime = false;
                        break;
                    } else {
                        x--;
                    }
                }
                if (isPrime) count++;
            }
        }
        
        return count;
    }
}