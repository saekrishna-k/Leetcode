class Solution {
    public int percentageLetter(String s, char letter) {
         // return ((int)s.chars().filter(a -> a == letter).count()*100)/s.length();
        if(s.indexOf(letter) < 0){
            return 0;
        }
        int c = 0;
        // int l = s.length();
        for(int i = 0; i < s.length() ; i++){
            if(letter == s.charAt(i)){
                c++;
            }
        }
        return (c*100)/s.length();
        // return (int)Arrays.stream(s.split("")).filter(ch -> letter==ch.charAt(0)).count()*100 / s.length();
    }
}