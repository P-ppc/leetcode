class Solution {
    public int compress(char[] chars) {
        Character ch = null;
        int count = 0,
            length = 0;

        for (char c : chars) {
            if (ch == null) {
                count = 1;
                ch = c;
            } else if (ch == c) {
                count++;
            } else if (ch != c) {
                chars[length] = ch;
                length++;

                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (int j = 0; j < countStr.length(); j++) {
                        chars[length] = countStr.charAt(j);
                        length++;
                    }
                }

                count = 1;
                ch = c;
            }
        }

        chars[length] = ch;
        length++;

        if (count > 1) {
            String countStr = String.valueOf(count);
            for (int j = 0; j < countStr.length(); j++) {
                chars[length] = countStr.charAt(j);
                length++;
            }
        }

        return length;
    }
}