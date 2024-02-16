class Solution {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (getBitCount(i) == k) {
                result += nums.get(i);
            }
        }
        return result;
    }

    int getBitCount(int number) {
        int bitCount = 0;
        while (number > 0) {
            if (number % 2 == 1) {
                bitCount++;
            }
            number = number >> 1;
        }
        return bitCount;
    }
}
