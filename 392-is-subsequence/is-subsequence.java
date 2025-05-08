class Solution {

    public boolean isSubsequence(String s, String t) {
        // int sp = 0;
        // int tp = 0;
        // int sl = s.length();
        // int tl = t.length();

        // while (sp < sl && tp < tl) {
        //     if (s.charAt(sp) == t.charAt(tp)) {
        //         sp++;
        //     }
        //     tp++;
        // }

        // return sp == sl;

        if (s.isEmpty()) return true;

        char arrT[] = t.toCharArray();
        char arrS[] = s.toCharArray();
        int i = 0;

        for (int j = 0; j < arrT.length; j++) {
            if (arrS[i] == arrT[j]) {
                if (i == arrS.length - 1) return true;
                i++;
            }
        }

        return false;
    }
}
