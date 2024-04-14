class Solution {

    public boolean areAlmostEqual(String s1, String s2) {
        // if (s1.equals(s2)) return true;
        // int[] frequency = new int[26];
        // int count = 0;
        // for (int i = 0; i < s1.length(); i++) {
        //     frequency[s1.charAt(i) - 'a']++;
        //     frequency[s2.charAt(i) - 'a']--;
        //     if (s1.charAt(i) != s2.charAt(i)) count++;
        //     if (count > 2) return false;
        // }
        // for (int i : frequency) {
        //     if (i > 0) {
        //         return false;
        //     }
        // }
        // return true;

        if (!s1.isEmpty() && s2.isEmpty()) return false;

        if (s1.isEmpty() && !s2.isEmpty()) return false;

        if (s1.equals(s2)) return true;

        int differences = 0;
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                differences++;
                if (index1 == -1) {
                    index1 = i;
                } else {
                    index2 = i;
                }
            }
        }

        return differences == 0 
            || (
                differences == 2 
                && s1.charAt(index1) == s2.charAt(index2) 
                && s1.charAt(index2) == s2.charAt(index1)
            );
    }
}
