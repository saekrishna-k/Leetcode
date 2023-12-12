class Solution {

    public boolean halvesAreAlike(String s) {
        int i = 0, j = s.length() / 2;
        int a = 0, b = 0;
        while (i < s.length() / 2) {
            if (
                s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u' ||
                s.charAt(i) == 'A' ||
                s.charAt(i) == 'E' ||
                s.charAt(i) == 'I' ||
                s.charAt(i) == 'O' ||
                s.charAt(i) == 'U'
            ) {
                a++;
            }

            if (
                s.charAt(j) == 'a' ||
                s.charAt(j) == 'e' ||
                s.charAt(j) == 'i' ||
                s.charAt(j) == 'o' ||
                s.charAt(j) == 'u' ||
                s.charAt(j) == 'A' ||
                s.charAt(j) == 'E' ||
                s.charAt(j) == 'I' ||
                s.charAt(j) == 'O' ||
                s.charAt(j) == 'U'
            ) {
                b++;
            }
            j++;
            i++;
        }
        return a == b ? true : false;
    }
}
