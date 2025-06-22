class Solution {

    public long maximumSubarraySum(int[] nums, int k) {
        // int l = nums.length;
        // if (l < k) return 0;

        // Map<Integer, Integer> freq = new HashMap<>();
        // long maxSum = 0, windowSum = 0;

        // for (int i = 0; i < k; i++) {
        //     windowSum += nums[i];
        //     freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        // }

        // if (freq.size() == k) {
        //     maxSum = windowSum;
        // }

        // for (int i = k; i < l; i++) {
        //     int outgoing = nums[i - k];
        //     windowSum -= outgoing;
        //     freq.put(outgoing, freq.get(outgoing) - 1);
        //     if (freq.get(outgoing) == 0) {
        //         freq.remove(outgoing);
        //     }

        //     int incoming = nums[i];
        //     windowSum += incoming;
        //     freq.put(incoming, freq.getOrDefault(incoming, 0) + 1);

        //     if (freq.size() == k) {
        //         maxSum = Math.max(maxSum, windowSum);
        //     }
        // }
        // return maxSum;


        

        Set<Integer> set = new HashSet<>();
        long sum = 0, maxSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}
