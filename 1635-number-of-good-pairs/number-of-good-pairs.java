class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int result = 0;
        for(int i : nums){
            int j = hashmap.getOrDefault(i,0);
            result+=j;
            hashmap.put(i,j+1);
        }
        return result;
    }
}