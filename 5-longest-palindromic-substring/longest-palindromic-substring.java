class Solution {

    public String longestPalindrome(String s) {
        int startIndex = 0;
        int l = s.length(), maxLength = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                if (isPalindrome(s, i, j)) {
                    int strLength = j - i + 1;
                    if (strLength > maxLength) {
                        maxLength = strLength;
                        startIndex = i;
                    }
                }
            }
        }
        return s.substring(startIndex, startIndex + maxLength);
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
