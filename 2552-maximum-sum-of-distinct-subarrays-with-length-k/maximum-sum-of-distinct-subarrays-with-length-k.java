class Solution {

    public long maximumSubarraySum(int[] nums, int k) {
        // int l = nums.length;
        // Set<Integer> numbers = new HashSet<>();

        // int maxSum = 0, sum = 0;

        // for (int i = 0; i < k; i++) {
        //     sum += nums[i];
        //     if (!numbers.contains(nums[i])) {
        //         numbers.add(nums[i]);
        //     }
        // }

        // maxSum = sum;

        // if (numbers.size() == 1 || numbers.size() == 2) {
        //     maxSum = 0;
        // }

        // for (int i = k; i < l; i++) {
        //     if (!numbers.contains(nums[i])) {
        //         sum -= nums[i - k];
        //         sum += nums[i];
        //         numbers.add(nums[i]);
        //         maxSum = sum > maxSum ? sum : maxSum;
        //     }
        // }
        // return maxSum;

        int l = nums.length;
        if (l < k) return 0;

        Map<Integer, Integer> freq = new HashMap<>();
        long maxSum = 0, windowSum = 0;

        
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        if (freq.size() == k) {
            maxSum = windowSum;
        }

       
        for (int i = k; i < l; i++) {
            int outgoing = nums[i - k];
            windowSum -= outgoing;
            freq.put(outgoing, freq.get(outgoing) - 1);
            if (freq.get(outgoing) == 0) {
                freq.remove(outgoing);
            }

        
            int incoming = nums[i];
            windowSum += incoming;
            freq.put(incoming, freq.getOrDefault(incoming, 0) + 1);

            if (freq.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }
}
