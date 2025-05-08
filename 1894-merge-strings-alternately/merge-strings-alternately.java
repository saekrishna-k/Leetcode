class Solution {

    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        StringBuilder s1 = new StringBuilder();
        int diff = l1 < l2 ? l1 : l2;

        for (int i = 0; i < diff; i++) {
            s1.append(word1.charAt(i));
            s1.append(word2.charAt(i));
        }

        if (l1 > l2) {
            s1.append(word1.substring(diff, l1));
        } else {
            s1.append(word2.substring(diff, l2));
        }
        return s1.toString();
    }
}
