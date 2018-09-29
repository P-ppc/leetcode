class Solution {
    public String complexNumberMultiply(String a, String b) {
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(.*)\\+(.*)i");
        java.util.regex.Matcher matcher1 = pattern.matcher(a),
                matcher2 = pattern.matcher(b);
        matcher1.find();
        matcher2.find();
        int real1 = Integer.valueOf(matcher1.group(1)),
            imaginary1 = Integer.valueOf(matcher1.group(2)),
            real2 = Integer.valueOf(matcher2.group(1)),
            imaginary2 = Integer.valueOf(matcher2.group(2));
        
        int real = real1 * real2 - imaginary1 * imaginary2,
            imaginary = real1 * imaginary2 + real2 * imaginary1;
        
        return String.format("%d+%di", real, imaginary);
    }
}