class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c = 0;
        for(int i = left; i <= right ; i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))){
                c++;
            }
        }
        return c;
    }

    public boolean isVowel(char c){
        switch(c){
            case 'a' : return true;
            case 'e' : return true;
            case 'i' : return true;
            case 'o' : return true;
            case 'u' : return true;
            default : return false;
        }
    }
}