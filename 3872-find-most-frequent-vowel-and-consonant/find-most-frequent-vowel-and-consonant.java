class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> v = new HashMap<>();
        Map<Character, Integer> c = new HashMap<>();
        int maxv = 0, maxc = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v.put(ch, v.getOrDefault(ch, 0) + 1);
                maxv = Math.max(maxv, v.get(ch));
            }else{
                v.put(ch, v.getOrDefault(ch, 0) + 1);
                  maxc = Math.max(maxc, v.get(ch));
            }
        }
        return maxv + maxc;
    }
}