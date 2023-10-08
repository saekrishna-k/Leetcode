class Solution {
    public int sumOfMultiples(int n) {
        // int r = 0;
        // for(int  i = 1 ; i <= n ; i++){
        //     if(i % 3 == 0){
        //         r+=i;
        //     }else if(i % 5 == 0){
        //         r+=i;
        //     }else if(i % 7 == 0){
        //         r+=i;
        //     }
        // }
        // return r;

        // return gauss(n / 3) * 3 + gauss(n / 5) * 5 + gauss(n / 7) * 7
        //     - gauss(n / 15) * 15 - gauss(n / 21) * 21 - gauss(n / 35) * 35
        //     + gauss(n / 105) * 105;
        
 // support variables
        int res = gauss(n / 3) * 3 + gauss(n / 5) * 5 + gauss(n / 7) * 7;
        // discounting multiples of two factors
        if (n > 14) res -= gauss(n / 15) * 15 + gauss(n / 21) * 21 + gauss(n / 35) * 35;
        // adjusting for multiples of all 3
        if (n > 104) res += gauss(n / 105) * 105;
        return res;
        
    }

    public int gauss(int n){
        return (n + 1) * n / 2;
    }
}