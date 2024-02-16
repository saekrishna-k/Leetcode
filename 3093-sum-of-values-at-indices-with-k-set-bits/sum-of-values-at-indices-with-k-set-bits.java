class Solution {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        //     int result = 0;
        //     for (int i = 0; i < nums.size(); i++) {
        //         if (Integer.bitCount(i) == k) {
        //             result += nums.get(i);
        //         }
        //     }
        //     return result;
        // }

        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                result += nums.get(i);
            }
        }
        return result;
    }

    int getBitCount(int number) {
        int bitCount = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                bitCount++;
            }
            number = number >> 1;
        }
        return bitCount;
    }
}
