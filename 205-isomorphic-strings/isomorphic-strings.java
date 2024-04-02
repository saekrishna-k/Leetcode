class Solution {

    public boolean isIsomorphic(String s, String t) {
        // Map<Character, Character> m = new HashMap<>();
        // int sl = s.length();
        // for (int i = 0; i < sl; i++) {
        //     char sc = s.charAt(i), tc = t.charAt(i);
        //     if (m.containsKey(sc)) {
        //         if (m.get(sc) != tc) {
        //             return false;
        //         }
        //     } else if (m.containsValue(tc)) {
        //         return false;
        //     } else {
        //         m.put(sc, tc);
        //     }
        // }
        // return true;

        int smap[] = new int[256];
        int tmap[] = new int[256];
        int sl = s.length();
        for (int i = 0; i < sl; i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (smap[sc] != tmap[tc]) {
                return false;
            }
            smap[sc] = i + 1;
            tmap[tc] = i + 1;
        }
        return true;
    }
}
