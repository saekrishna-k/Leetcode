class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> result = new ArrayList<>();
        // Map<Integer, Integer> m = new HashMap<>();
        // int l = nums.length;
        // for (int i = 0; i < l - 2; i++) {
        //     for (int j = i + 1; j < l - 1; j++) {
        //         for (int k = i + 2; k < l; k++) {
        //             if (nums[i] + nums[j] + nums[k] == 0 && 
        //             (!m.containsKey(nums[i]) || 
        //             !m.containsKey(nums[j]) || 
        //             !m.containsKey(nums[k]))) {
        //                 List<Integer> al = new ArrayList<>();
        //                 al.add(nums[i]);
        //                 al.add(nums[j]);
        //                 al.add(nums[k]);
        //                 result.add(al);
        //                 m.put(nums[i], i);
        //                 m.put(nums[j], j);
        //                 m.put(nums[k], k);
        //             }
        //         }
        //     }
        // }
        // return result;




        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int l = nums.length;

        for (int i = 0; i < l; i++) {
            if (nums[i] > 0) {
                break;
            } else if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1, high = l - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[low]);
                    al.add(nums[high]);
                    result.add(al);
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
}
