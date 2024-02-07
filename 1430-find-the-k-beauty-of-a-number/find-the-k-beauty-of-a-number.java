class Solution {

    public int divisorSubstrings(int num, int k) {
        int result = 0;
        String str = String.valueOf(num);
        for (int i = 0; i < str.length() - k + 1; i++) {
            String s = str.substring(i, i + k);
            int n = Integer.valueOf(s);
            if (n != 0 && num % n == 0) {
                result++;
            }
        }
        return result;
    }
}
