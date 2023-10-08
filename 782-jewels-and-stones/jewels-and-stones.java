class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         // return stones.replaceAll("[^" + jewels + "]", "").length();
        int result = 0;
        for(int i=0 ; i<stones.length(); i++){
            if(jewels.indexOf(stones.charAt(i)) != -1){
                result+=1;
            }
        }
        return result;
    }
}