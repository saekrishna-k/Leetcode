class Solution {

    public int firstUniqChar(String s) {
        // char c = 'a';
        // int index = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     c = s.charAt(i);
        //     index = s.indexOf(c);
        //     if (s.indexOf(c, index + 1) == -1) {
        //         return i;
        //     }
        // }
        // return -1;

        int ans = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c)) {
                ans = Math.min(ans, index);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
