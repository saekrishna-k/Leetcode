class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) return result;

        // Frequency array for characters in p
        int[] charCount = new int[26];
        for (int i = 0; i < pLen; i++) {
            charCount[p.charAt(i) - 'a']++;
        }

        int left = 0, right = 0, count = pLen;

        while (right < sLen) {
            // If the character at right is needed, decrement count
            if (charCount[s.charAt(right) - 'a'] > 0) {
                count--;
            }
            // Decrement the frequency for the current character
            charCount[s.charAt(right) - 'a']--;
            right++;

            // When count reaches 0, an anagram is found
            if (count == 0) {
                result.add(left);
            }

            // If window size equals pLen, slide the window
            if (right - left == pLen) {
                // If the character at left was part of p, increment count
                if (charCount[s.charAt(left) - 'a'] >= 0) {
                    count++;
                }
                // Restore the frequency for the character at left
                charCount[s.charAt(left) - 'a']++;
                left++;
            }
        }
        return result;
    }
}
