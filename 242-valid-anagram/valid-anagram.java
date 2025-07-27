class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if (sl != tl) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < sl; i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int val : freq) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}