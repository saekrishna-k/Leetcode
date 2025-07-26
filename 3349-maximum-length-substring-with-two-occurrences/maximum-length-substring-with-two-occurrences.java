class Solution {
    public int maximumLengthSubstring(String s) {
        char[] freq = new char[26];
        int left = 0, max = 0, l = s.length();
        for (int right = 0; right < l; right++) {
            char c = s.charAt(right);
            freq[c - 'a']++;
            if (freq[c - 'a'] <= 2) {
                max = Math.max(max, right - left + 1);
            }
            while (freq[c - 'a'] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

        }
        return max;
    }
}