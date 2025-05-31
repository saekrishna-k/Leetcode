class Solution {

    public int minPairSum(int[] nums) {
        int maxSum = 0, low = 0, high = nums.length - 1;
        Arrays.sort(nums);
        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum > maxSum) {
                maxSum = sum;
            }
            low++;
            high--;
        }
        return maxSum;
    }
}
