class Solution {
    public String mergeAlternately(String word1, String word2) {
        // int l1 = word1.length();
        // int l2 = word2.length();
        // String r = "";
        // if(l1<l2){
        //         for(int i = 0 ; i < l1 ; i++){
        //         r = r + word1.charAt(i) + word2.charAt(i);
        //     }
        //     r = r + word2.substring(l1);
        // }else if(l1>l2){
        //         for(int i = 0 ; i < l2 ; i++){
        //         r = r + word1.charAt(i) + word2.charAt(i);
        //     }
        //     r = r + word1.substring(l2);
        // }else{
        //     for(int i = 0 ; i < l1 ; i++){
        //         r = r + word1.charAt(i) + word2.charAt(i);
        //     }
        // }
        // return r;
                int l1 = word1.length();
        int l2 = word2.length();
          StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < l1 || i < l2) {
            if (i < l1) {
                result.append(word1.charAt(i));
            }
            if (i < l2) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}