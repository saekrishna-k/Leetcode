class Solution {

    public boolean detectCapitalUse(String word) {
        int c = 1;
        if (word.charAt(0) >= 'a') {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) < 'a') {
                    c++;
                    System.out.println(c);
                }
            }
            if (c > 1 && c < word.length()) {
                return false;
            }
        }
        return true;
    }
}
