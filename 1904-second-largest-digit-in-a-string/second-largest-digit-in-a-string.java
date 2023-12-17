class Solution {

    public int secondHighest(String s) {
        // int m = -1, sm = -1;
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) > '0' && s.charAt(i) < '9') {
        //         int n = s.charAt(i) - '0';
        //         if (m < n) {
        //             sm = m;
        //             m = n;
        //         } else if (sm < n && n < m) {
        //             sm = n;
        //         }
        //     }
        // }
        // return sm;

        int first = -1;
        int second = -1;
        for (int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            if (Character.isDigit(current)) {
                int value = current - '0';
                if (value > first) {
                    second = first;
                    first = value;
                }
                else if (second < value && value < first) {
                    second = value;
                }
            }
        }
        return second;
    }
}
