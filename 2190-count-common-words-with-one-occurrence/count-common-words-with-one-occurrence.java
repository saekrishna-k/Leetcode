class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> mp = new HashMap<>();
        for(String str : words1){
               mp.put(str, mp.getOrDefault(str , 0 ) + 1);
        }
        // for(String str : words2){
        //     Integer feq = mp.get(str);
        //   if(feq != null && feq <= 1){
        //        mp.put(str, feq - 1);
        //    }
        // }
        // int c = 0;
        // for(Map.Entry<String,Integer> e : mp.entrySet()){
        //     if(e.getValue() == 0){
        //         c++;
        //     }
        // }
        // return c;

        int c = 0;
        for(String word : words2) {
            Integer freq = mp.get(word);
            if(freq != null && freq <= 1) {
                if(freq == 1) {
                    ++c;
                } else if (freq == 0) {
                    --c;
                }
                mp.put(word, freq - 1);
            }
        }
        return c;
    }
}