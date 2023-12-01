class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int l = nums.length;
        // for(int i = 0 ; i < l - 1; i++){
        //    for(int j = i + 1 ; j < l ; j++){
        //        if(nums[i] == nums[j]){
        //            return true;
        //        }
        //    }
        // }
        // return false;

        // Arrays.sort(nums);
        // int l = nums.length;
        // for (int i = 1; i < l; i++) {
        //     if (nums[i] == nums[i - 1])
        //         return true;
        // }
        // return false;

        // Set<Integer> s = new HashSet<>();
        // for(int i = 0 ; i < nums.length ; i++){
        //    if(!s.add(nums[i])){
        //        return true;
        //    }
        // }
        // return false;

        Set<Integer> s = new HashSet<>();
        for(int n : nums){
           if(s.contains(n)){
               return true;
           }
           s.add(n);
        }
        return false;
    }
}