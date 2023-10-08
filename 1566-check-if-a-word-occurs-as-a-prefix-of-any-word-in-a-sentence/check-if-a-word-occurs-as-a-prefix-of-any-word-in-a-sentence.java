class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int r = 0;
        int i = 1;
        for(String s : sentence.split(" ")){
            if(s.startsWith(searchWord)){
               return i;
            }
            i++;
        }
        return -1;
    }
}