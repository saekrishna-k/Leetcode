class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int i = 0;
        if(s.length() != words.size()){
            return false;
        }
        for(String a : words){
            if(s.charAt(i) != a.charAt(0)){
                return false;
            }
            i++;
        }
        return true;


        // int i=0;
        // for(String ss: words)
        //     if(i>=s.length()||s.charAt(i++)!=ss.charAt(0)) return false;
        // return i==s.length();

        // if(words.size() != s.length())  return false;
        // for(int i=0; i<words.size(); i++){
        //     if(words.get(i).charAt(0) != s.charAt(i))  return false;
        // }
        // return true;
    }
}