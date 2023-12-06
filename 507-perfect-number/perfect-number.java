class Solution {
    public boolean checkPerfectNumber(int num) {
        // int s = 0;
        // int n = num / 2;
        // for(int i = 1 ; i <= n ; i++){
        //     if(num % i == 0){
        //         s += i;
        //     }
        // }
        // return s == num;

        if(num == 1) return false;
        int s = 1;
        int n = num / 2;
        for(int i = 2 ; i <= n ; i++){
            if(num % i == 0){
                s += i;
            }
        }
        return s == num;
    }
}