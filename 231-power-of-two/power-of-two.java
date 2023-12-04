class Solution {
    public boolean isPowerOfTwo(int n) {
        // return n > 0 && n != 0 && (n & (n-1)) == 0;

        // if(n <= 0){
        //     return false;
        // }

        // while(n > 0){
        //     if(n == 1){
        //     return true;
        //     }
        //     if(n % 2 != 0){
        //         return false;
        //     }else{
        //         n /= 2;
        //     }
        // }
        // return true;


        // if(n == 0) return false;
        // while(n%2 == 0) n/=2;
        // return n == 1;

        if(n==0) return false;
        return ((n==1) || (n%2==0 && isPowerOfTwo(n/2)));

        //  if(n <= 0) return false;
        //  return Math.ceil(Math.log(n)) == Math.floor(Math.log(n));
    }
}