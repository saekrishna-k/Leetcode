class Solution {
    private int numberOfAtmostSubarrays(int[] nums, int k) {
        int l = nums.length, count = 0, result = 0, left = 0;
        for (int right = 0; right < l; right++) {
            if (nums[right] % 2 == 1) {
                count++;
            }
            while (count > k) {
                if (nums[left] % 2 == 1) {
                    count--;
                }
                left++;
            }
            result = result + right - left + 1;
        }
        return result;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        // return numberOfAtmostSubarrays(nums, k) - numberOfAtmostSubarrays(nums, k - 1);

        int left = 0;
        int count = 0; // tracks how many valid subarrays end at current right
        int oddcount = 0; // current number of odd numbers in window
        int result = 0; // final answer

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 != 0) { // if it's an odd number
                oddcount++; // increase odd count
                count = 0; // reset count — we are starting a new group of valid subarrays
            }

            // when we find exactly k odd numbers in the window
            while (oddcount == k) {
                if (nums[left] % 2 != 0) {
                    oddcount--; // we will remove one odd from the left
                }
                count++; // count how many valid left positions give exactly k odds
                left++; // shrink the window from the left
            }

            result += count; // add count of valid subarrays ending at this right
        }

        return result;
    }
}