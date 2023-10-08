class Solution {
    public int balancedStringSplit(String s) {
         int r = 0;
        int c = 0;
        for(short i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                r++;
            }else{
                r--;
            }if(r==0){
                c++;
            }
        }
        return c;
    }
}