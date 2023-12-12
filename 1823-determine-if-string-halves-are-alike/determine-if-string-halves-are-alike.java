class Solution {

    public boolean halvesAreAlike(String s) {
        int l = s.length();
        String a = s.substring(0, l / 2);
        String b = s.substring(l / 2, l);
        int i = 0, j = 0;
        int a1 = 0, b1 = 0;
        while (i < l / 2 ) {
            if (
                a.charAt(i) == 'a' ||
                a.charAt(i) == 'e' ||
                a.charAt(i) == 'i' ||
                a.charAt(i) == 'o' ||
                a.charAt(i) == 'u' ||
                a.charAt(i) == 'A' ||
                a.charAt(i) == 'E' ||
                a.charAt(i) == 'I' ||
                a.charAt(i) == 'O' ||
                a.charAt(i) == 'U'
            ) {
                a1++;
            }

            if (
                b.charAt(j) == 'a' ||
                b.charAt(j) == 'e' ||
                b.charAt(j) == 'i' ||
                b.charAt(j) == 'o' ||
                b.charAt(j) == 'u' ||
                b.charAt(j) == 'A' ||
                b.charAt(j) == 'E' ||
                b.charAt(j) == 'I' ||
                b.charAt(j) == 'O' ||
                b.charAt(j) == 'U'
            ) {
                b1++;
            }
            j++;
            i++;
        }
        return a1 == b1 ? true : false;
    }
}
