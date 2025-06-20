class Solution {

    public int strStr(String haystack, String needle) {

        // return haystack.indexOf(needle);


        int l1 = haystack.length();
        int l2 = needle.length();

        int p1 = 0, p2 = 0;

        while (p1 < l1) {
            if (haystack.charAt(p1) == needle.charAt(p2)) {
                p1++;
                p2++;
                if (p2 == l2) {
                    return p1 - l2;
                }
            } else {
                p1 = p1 - p2 + 1;
                p2 = 0;
            }
        }
        return -1;
    }
}
