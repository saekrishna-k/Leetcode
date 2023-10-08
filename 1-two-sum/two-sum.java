class Solution {
    public int[] twoSum(int[] nums, int target) {
        //  int i,j;
        // int a[]=new int[2];
        // for(i=0;i<(nums.length)-1;i++)
        // {
        //     for(j=i+1;j<(nums.length);j++)
                  
        //     {
        //         if((nums[i]+nums[j])==target)
        //         {
        //             a[0]=i;
        //             a[1]=j;
        //         }
        //     }
            
        // }
        // return a;

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //           {
        //              return new int[]{i,j};
        //           }
            
        //      }
        // }
        //  throw new IllegalArgumentException("No two sum solution");

 Map<Integer,Integer> hashMap =  new HashMap<>();

        for(int i = 0 ; i<nums.length;i++){
            int result = target - nums[i];
            if(hashMap.containsKey(result)){
                return new int[]{hashMap.get(result),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[] {};
    }
}