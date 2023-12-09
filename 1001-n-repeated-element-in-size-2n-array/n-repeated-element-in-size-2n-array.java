class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> s =  new HashSet<Integer>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!s.add(nums[i])){
                return nums[i];
            }
        }
        return 0;
    }
}