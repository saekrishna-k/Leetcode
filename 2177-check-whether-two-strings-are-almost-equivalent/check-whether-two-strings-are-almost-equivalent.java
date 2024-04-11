class Solution {

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] frequency = new int[27];
        int l1 = word1.length(), l2 = word2.length();
        for (int i = 0; i < l1; i++) {
            frequency[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < l2; i++) {
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
