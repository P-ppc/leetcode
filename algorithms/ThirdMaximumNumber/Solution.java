class Solution {
    public int thirdMax(int[] nums) {
        Integer maxNum = null,
                secondNum = null,
                thirdNum = null;
        
        for (int num : nums) {
            if (maxNum == null) {
                maxNum = num;
            } else {
                maxNum = Math.max(maxNum, num);
            }
        }
        
        for (int num : nums) {
            if (num == maxNum) {
                continue;
            } else if (secondNum == null) {
                secondNum = num;
            } else {
                secondNum = Math.max(secondNum, num);
            }
        }
        
        for (int num : nums) {
            if (num == maxNum || num == secondNum) {
                continue;
            } else if (thirdNum == null) {
                thirdNum = num;
            } else {
                thirdNum = Math.max(thirdNum, num);
            }
        }
        
        return thirdNum != null ? thirdNum : maxNum;
    }
}