class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = null;
        
        for (String str : strs) {
            if (prefix == null) {
                prefix = str;
            } else {
                String tempPrefix = "";
                for (int j = 0; j < Math.min(prefix.length(), str.length()); j++) {
                    if (prefix.charAt(j) == str.charAt(j)) {
                        tempPrefix += new String(new char[]{prefix.charAt(j)});
                    } else {
                        break;
                    }
                }
                
                prefix = tempPrefix;
                if (prefix.equals("")) {
                    return prefix;
                }
            }
        }
        
        return prefix == null ? "" : prefix;
    }
}