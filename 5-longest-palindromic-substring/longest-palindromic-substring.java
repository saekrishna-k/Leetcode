class Solution {

    public String longestPalindrome(String s) {
        //     int startIndex = 0;
        //     int l = s.length(), maxLength = 0;
        //     for (int i = 0; i < l; i++) {
        //         for (int j = i; j < l; j++) {
        //             if (isPalindrome(s, i, j)) {
        //                 int strLength = j - i + 1;
        //                 if (strLength > maxLength) {
        //                     maxLength = strLength;
        //                     startIndex = i;
        //                 }
        //             }
        //         }
        //     }
        //     return s.substring(startIndex, startIndex + maxLength);
        // }

        // private boolean isPalindrome(String s, int left, int right) {
        //     while (left < right) {
        //         if (s.charAt(left) != s.charAt(right)) {
        //             return false;
        //         }
        //         left++;
        //         right--;
        //     }
        //     return true;

        int l = s.length();
        if (l <= 1) {
            return s;
        }
        String maxStr = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > maxStr.length()) {
                maxStr = odd;
            }
            if (even.length() > maxStr.length()) {
                maxStr = even;
            }
        }
        return maxStr;
    }
    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
