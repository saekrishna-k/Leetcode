class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int l = nums.length;
        // for (int i = 0; i < l; i++) {
        //     for (int j = i + 1; j < l; j++) {
        //         if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int l = nums.length;
        if (nums.length <= 1 || k == 0) {
            return false;
        }

        Set<Integer> slidingWindow = new HashSet<>();
        for (int index = 0; index < l; index++) {
            if (slidingWindow.contains(nums[index])) 
                return true;
            if (index >= k) 
                slidingWindow.remove(nums[index - k]);
            slidingWindow.add(nums[index]);
        }
        return false;
    }
}
