class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        Map<Character, String> hm = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (hm.containsKey(c)) {
                if (!hm.get(c).equals(words[i])) {
                    return false;
                }
            } else {
                if (hm.containsValue(words[i])) {
                    return false;
                }
                hm.put(c, words[i]);
            }
        }
        return true;
    }
}