class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i : nums){
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }
        }
        return k * (max - min);
    }
}