class Solution {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int[] frequency = new int[26];
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i) - 'a']++;
            frequency[s2.charAt(i) - 'a']--;
            if (s1.charAt(i) != s2.charAt(i)) count++;
            if (count > 2) return false;
        }
        for (int i : frequency) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
