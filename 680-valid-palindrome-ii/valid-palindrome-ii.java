class Solution {

    public boolean validPalindrome(String s) {
        // int[] frequency = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     frequency[s.charAt(i) - 'a']++;
        // }
        // int count = 0;
        // for (int i = 0; i < 26; i++) {
        //     if (frequency[i] == 1) {
        //         count++;
        //     }
        //     if(count > 2){
        //         return false;
        //     }
        // }
        // return true;

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return checkPalindrome(left + 1, right, s) || checkPalindrome(left, right - 1, s);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean checkPalindrome(int left, int right, String s) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
