class Solution {

    int count = 0;
    public int countSubstrings(String s) {
        // int count = 0;
        // int l = s.length();
        // for (int i = 0; i < l; i++) {
        //     for (int j = i; j < l; j++) {
        //         if (isPalindrome(s, i, j)) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int l = s.length();
        if (l <= 1) {
            return 1;
        }

        for (int i = 0; i < l; i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }
        return count;
    }

    private void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
    }

    // private boolean isPalindrome(String s, int left, int right) {
    //     while (left < right) {
    //         if (s.charAt(left) != s.charAt(right)) {
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
}
