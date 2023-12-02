class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];


        // int k = nums.length / 2;
        // int max = 0;
        // Map<Integer,Integer> m = new HashMap<>();
        // for(int i = 0 ; i < nums.length ; i++){
        //     int v = m.getOrDefault(nums[i],0);
        //     m.put(nums[i],++v);
        //     System.out.print(nums[i] + " ");
        //     System.out.print(v);
        //     System.out.println();
        //     if(v >= k){
        //         return nums[i];
        //     }
        // }
        // return 0;
    }
}