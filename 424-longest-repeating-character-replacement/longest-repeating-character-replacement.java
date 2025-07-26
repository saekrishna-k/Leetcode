class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxRepeatChar = 0, left = 0, result = 0, l = s.length();
        for (int right = 0; right < l; right++) {
            char c = s.charAt(right);
            freq[c - 'A']++;
            maxRepeatChar = Math.max(maxRepeatChar, freq[c - 'A']);

            while ((right - left + 1) - maxRepeatChar > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}