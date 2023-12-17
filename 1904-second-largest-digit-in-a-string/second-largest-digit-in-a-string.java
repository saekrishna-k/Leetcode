class Solution {

    public int secondHighest(String s) {
        int m = -1, sm = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int d = c - '0';
                if (m < d) {
                    sm = m;
                    m = d;
                } else if (sm < d && d < m) {
                    sm = d;
                }
            }
        }
        return sm;
    }
}
