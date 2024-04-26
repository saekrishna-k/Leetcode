class Solution {

    public String maximumOddBinaryNumber(String s) {
        // int onesCount = 0, zerosCount = 0;
        // for (char c : s.toCharArray()) {
        //     if (c == '0') zerosCount++; else if (c == '1') onesCount++;
        // }
        // StringBuilder result = new StringBuilder();
        // result.append("1".repeat(onesCount - 1));
        // result.append("0".repeat(zerosCount));
        // result.append("1");

        // return result.toString();

        int onesCount = 0, zerosCount = 0, l = s.length();
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == '0') zerosCount++; else if (s.charAt(i) == '1') onesCount++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < l; i++) {
            if (onesCount > 1) {
                result.append("1");
                onesCount--;
            } else if (onesCount == 1 && zerosCount > 0) {
                result.append("0");
                zerosCount--;
            }
        }
        return result.append("1").toString();
    }
}
