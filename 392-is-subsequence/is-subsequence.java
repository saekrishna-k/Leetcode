class Solution {

    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;
        int sl = s.length();
        int tl = t.length();

        while (sp < sl && tp < tl) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();
    }
}
