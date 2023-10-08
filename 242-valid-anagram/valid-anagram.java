class Solution {
    public boolean isAnagram(String s, String t) {
       int sl = s.length();
        int tl = t.length();
         if (sl != tl) {
            return false;
        }
        int[] count = new int[26];
        for(int i = 0 ; i < sl ; i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < tl ; i++){
            count[t.charAt(i) - 'a']--;
        }
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true; 
    }
}