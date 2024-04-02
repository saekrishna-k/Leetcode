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

        int map1[] = new int[200];
        int map2[] = new int[200];
        int sl = s.length();
        for (int i = 0; i < sl; i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (map1[sc] != map2[tc]) {
                return false;
            }
            map1[sc] = i + 1;
            map2[tc] = i + 1;
        }
        return true;
    }
}
