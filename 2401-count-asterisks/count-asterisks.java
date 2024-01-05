class Solution {

    public int countAsterisks(String s) {
        // int count = 0, r = 0, n = s.length();
        // for (int i = 0; i < n; i++) {
        //     if (s.charAt(i) == '|') {
        //         count++;
        //     }
        //     if (count % 2 == 0 && s.charAt(i) == '*') {
        //         r++;
        //     }
        // }
        // return r;

        int r = 0, n = s.length();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (!flag && s.charAt(i) == '*') {
                r++;
            } else if (s.charAt(i) == '|') {
                flag = !flag;
            }
        }
        return r;
    }
}
