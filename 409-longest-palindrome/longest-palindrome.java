class Solution {

    public int longestPalindrome(String s) {
        int[] frequency = new int[128];
        for (char c : s.toCharArray()) {
            frequency[c]++;
        }

        int result = 0;

        for (int count : frequency) {
            result += count / 2 * 2;
            // if(result % 2 == 0 && count % 2 == 1){
            //     result += 1;
            // }
        }
        return result < s.length() ? result + 1 : result;
    }
}
