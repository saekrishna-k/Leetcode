class Solution {

    public boolean checkRecord(String s) {
        int a = 0, l = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
                l = c > l ? c : l;
                c = 0;
            } else if (s.charAt(i) == 'L') {
                c++;
            } else {
                l = c > l ? c : l;
                c = 0;
            }
        }
        l = c > l ? c : l;
        if (a < 2 && l < 3) {
            return true;
        } else {
            return false;
        }
    }
}
