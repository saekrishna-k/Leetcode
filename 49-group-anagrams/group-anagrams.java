class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();

        for(String s : strs){
            //char freq[] = new char[26];
            int freq[] = new int[26];
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
            }
            //String key = String.valueOf(freq);
            String key = Arrays.toString(freq);
            if(!hm.containsKey(key)){
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}