class Solution {

    public int alternateDigitSum(int n) {
        int sum = 0, i = 0;
        String str = String.valueOf(n);
        for (int j = 0; j < str.length(); j++) {
            i = Character.getNumericValue(str.charAt(j));
            if (j % 2 != 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }
}
