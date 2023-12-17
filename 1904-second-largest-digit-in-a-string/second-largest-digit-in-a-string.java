class Solution {

    public int secondHighest(String s) {
        int l = -1, sl = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                if (l < d) {
                    sl = l;
                    l = d;
                } else if (sl < d && d < l) {
                    sl = d;
                }
            }
        }
        return sl;
    }
}
