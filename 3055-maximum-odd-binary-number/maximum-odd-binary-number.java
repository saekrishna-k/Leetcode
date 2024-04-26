class Solution {

    public String maximumOddBinaryNumber(String s) {
        int onesCount = 0, zerosCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zerosCount++; else if (c == '1') onesCount++;
        }
        StringBuilder result = new StringBuilder();
        result.append("1".repeat(onesCount - 1));
        result.append("0".repeat(zerosCount));
        result.append("1");

        return result.toString();
    }
}
