class Solution {

    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if (sl != tl) {
            return false;
        }
        int[] c = new int[26];
        for (int i = 0; i < sl; i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < sl; i++) {
            c[t.charAt(i) - 'a']--;
        }
        for (int val : c) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
