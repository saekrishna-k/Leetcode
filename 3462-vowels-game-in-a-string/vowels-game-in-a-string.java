class Solution {

    public boolean doesAliceWin(String s) {
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         return true;
        //     }
        // }
        // return false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a','e','i','o','u':
                    return true;
            }
        }

        return false;
    }
}
