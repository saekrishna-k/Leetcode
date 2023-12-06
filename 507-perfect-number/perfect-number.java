class Solution {
    public boolean checkPerfectNumber(int num) {
        int s = 0;
        int n = num / 2;
        for(int i = 1 ; i <= n ; i++){
            if(num % i == 0){
                s += i;
            }
        }
        if(s == num){
            return true;
        }else{
            return false;
        }
    }
}