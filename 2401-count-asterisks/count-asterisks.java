class Solution {

    public int countAsterisks(String s) {
        int count = 0, r = 0;
        boolean flag;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                count++;
            }
            if (count % 2 == 0 && s.charAt(i) == '*') {
                r++;
            }
        }
        return r;
    }
}
