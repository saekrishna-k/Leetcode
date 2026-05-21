class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> nums = new HashSet<>();

        for(int i : arr1){
            while(i > 0){
                nums.add(i);
                i /= 10;
            }
        }

        int max = 0;
        for(int i : arr2){
            while( i > 0){
                if(nums.contains(i)){
                    max = Math.max(max, i);
                    break;
                }
                i /= 10;
            }
        }

        int count = 0;
        while(max > 0){
            count++;
            max /= 10;
        }
        return count;
    }
}