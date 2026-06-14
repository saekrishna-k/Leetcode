class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        // StringBuilder ans = new StringBuilder(words.length);
        // for (String word : words) {
        //     int s = 0;
        //     for (int i = 0; i < word.length(); i++) {
        //         s += weights[word.charAt(i) - 'a'];
        //     }
        //     ans.append((char) ('z' - (s % 26)));
        // }
        // return ans.toString();

        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += weights[c - 'a'];
            }
            sb.append((char) ('a' + (26 - (sum % 26) - 1)));

        }
        return sb.toString();
    }
}