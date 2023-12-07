class Solution {

    public boolean detectCapitalUse(String word) {
        if (word.charAt(0) >= 'a') {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    return false;
                }
            }
        } else {
            int c = 1;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) < 'a') {
                    c++;
                }
            }
            if (c > 1 && c < word.length()) {
                return false;
            }
        }
        return true;
    }
}
