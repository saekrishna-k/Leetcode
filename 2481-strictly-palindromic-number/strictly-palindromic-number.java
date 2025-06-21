class Solution {

    public boolean isStrictlyPalindromic(int n) {
        // for (int base = 2; base <= n - 2; base++) {
        //     String s = conversion(n, base);
        //     if (!isPalindrome(s)) {
        //         return false;
        //     }
        // }
        // return true;

        return false;
    }

    private String conversion(int n, int base) {
        String s = "";
        while (n > 0) {
            s = n % base + s;
            n /= base;
        }
        return s;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
