class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        Map<Character, String> hm = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (hm.containsKey(c)) {
                if (!hm.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (hm.containsValue(word)) {
                    return false;
                }
                hm.put(c, word);
            }
        }
        return true;
    }
}
