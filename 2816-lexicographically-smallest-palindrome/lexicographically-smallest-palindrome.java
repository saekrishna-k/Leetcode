class Solution {

    public String makeSmallestPalindrome(String s) {
        int count = 0, start = 0, end = s.length() - 1;
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        while (start < end) {
            char a = s.charAt(start);
            char b = s.charAt(end);
            if (a != b) {
                if (a < b) {
                    result1.append(a);
                    result2.append(a);
                } else {
                    result1.append(b);
                    result2.append(b);
                }
            } else {
                result1.append(a);
                result2.append(a);
            }
            start++;
            end--;
        }
        if (s.length() % 2 != 0) {
            result1.append(s.charAt(start));
        }
        return result1.append(result2.reverse()).toString();
    }
}
