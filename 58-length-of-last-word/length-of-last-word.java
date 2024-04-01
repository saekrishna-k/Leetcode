class Solution {

    public int lengthOfLastWord(String s) {
        // int l = s.length() - 1, result = 0;
        // boolean flag = false;
        // for (int i = l; i > -1; i--) {
        //     if (s.charAt(i) == ' ' && flag) {
        //         break;
        //     }
        //     if (s.charAt(i) != ' ') {
        //         flag = true;
        //         result++;
        //     }
        // }
        // return result;

        int l = s.length() - 1, result = 0;
        for (int i = l; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                result++;
            } else if (result != 0) {
                break;
            }
        }
        return result;
    }
}
