class Solution {

    public int minSteps(String s, String t) {
        int[] frequency = new int[26];
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for (int i : frequency) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }
}
