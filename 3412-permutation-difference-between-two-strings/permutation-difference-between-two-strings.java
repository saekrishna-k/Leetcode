class Solution {

    public int findPermutationDifference(String s, String t) {
        // int sum = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     sum += Math.abs(i - t.indexOf(s.charAt(i)));
        // }

        // return sum;

        return iterate(0, s, t);
    }

    public static int iterate(int n, String s, String t) {
        if (n == s.length()) {
            return 0;
        }

        return Math.abs(n - t.indexOf(s.charAt(n))) + iterate(n + 1, s, t);
    }
}
