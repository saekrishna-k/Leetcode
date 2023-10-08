class Solution {
    public int fib(int n) {
        // if(n<=1)
        //     return n;
        // return fib(n-2) + fib(n-1);
        if(n<=1){
            return n;
        }
        int secondlast = 0;
         int last = 1;
        int res = 0;
        for(int i = 2 ; i <= n ; i++){
            res = last + secondlast;
            secondlast = last;
            last = res;
        }
        return res;
    }
}