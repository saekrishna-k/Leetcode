class Solution {

    public int alternateDigitSum(int n) {
        int count = 1, sum = 0, i = 0;
        String str = String.valueOf(n);
        for (int j = 0; j < str.length(); j++) {
            i = Character.getNumericValue(str.charAt(j));
            if (count % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
            count++;
        }
        return sum;
    }
}
