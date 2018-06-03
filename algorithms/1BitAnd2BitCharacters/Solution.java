class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        
        while (index < bits.length) {
            if (bits[index] == 1) {
                if (index + 2 == bits.length) {
                    return false;
                } else {
                    index += 2;
                }
            } else {
                index++;
            }
        }
        
        return true;
    }
}