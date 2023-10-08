class Solution {
    public char findTheDifference(String s, String t) {
        // for(int i = 0 ; i < t.length() ; i++){
        //         if(s.indexOf(t.charAt(i)) < 0){
        //             return t.charAt(i);
        //         }
        // }
        // return s^t;
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}