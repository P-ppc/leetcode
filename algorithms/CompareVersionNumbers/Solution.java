class Solution {
    public int compareVersion(String version1, String version2) {
        String[] version1Splits = version1.split("\\."),
                 version2Splits = version2.split("\\.");
        int minLength = Math.min(version1Splits.length, version2Splits.length),
            maxLength = Math.max(version1Splits.length, version2Splits.length);
        
        for (int i = 0; i < minLength; i++) {
            if (Integer.valueOf(version1Splits[i]) > Integer.valueOf(version2Splits[i]))
                return 1;
            else if (Integer.valueOf(version1Splits[i]) < Integer.valueOf(version2Splits[i]))
                return -1;
        }
        
        if (minLength == maxLength) 
            return 0;
        
        String[] splits = version1Splits.length > version2Splits.length ? version1Splits : version2Splits;
        for (int i = minLength; i < maxLength; i++) {
            if (Integer.valueOf(splits[i]) > 0)
                return version1Splits.length > version2Splits.length ? 1 : -1;
        }
        
        return 0;
    }
}