class Solution {

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] frequency = new int[26];
        int l1 = word1.length();
        for (int i = 0; i < l1; i++) {
            frequency[word1.charAt(i) - 'a']++;
            frequency[word2.charAt(i) - 'a']--;
        }
        for (int i : frequency) {
            if (i > 3 || i < -3) {
                return false;
            }
        }
        return true;
    }
}
