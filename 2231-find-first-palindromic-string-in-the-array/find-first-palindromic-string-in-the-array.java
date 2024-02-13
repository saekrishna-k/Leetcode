class Solution {

    public String firstPalindrome(String[] words) {
        for (String str : words) {
            int s = 0;
            int e = str.length() - 1;
            boolean flag = true;
            while (s < e) {
                if (str.charAt(s) != str.charAt(e)) {
                    flag = false;
                    break;
                }
                s++;
                e--;
            }
            if (flag) {
                return str;
            }
        }
        return "";
    }
}
