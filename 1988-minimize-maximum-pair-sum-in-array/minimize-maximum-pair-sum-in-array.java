class Solution {

    public int minPairSum(int[] nums) {
        int maxSum = 0, low = 0, high = nums.length - 1;
        Arrays.sort(nums);
        while (low < high) {
            int sum = nums[low] + nums[high];
            // maxSum = Math.max(sum, maxSum);
            // if(sum > maxSum){
            //     maxSum = sum;
            // }
            maxSum = sum > maxSum ? sum : maxSum; 
            low++;
            high--;
        }
        return maxSum;
    }
}
