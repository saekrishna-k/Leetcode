class Solution {

    public int countSubstrings(String s) {
        int count = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                if (isPalindrome(s, i, j)) {
                    count++;
                }
            }
        }
        return count;
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
