class Solution {
    public int subtractProductAndSum(int n) {
        // int s = 0;
        // int p = 1;
        // while(n > 0){
        //     int d = n % 10;
        //     s+=d;
        //     p*=d;
        //     n/=10;
        // }
        
        // return p - s;
        int sum = 0;
        int pro = 1;
        return calc(n, sum, pro);
    }

     int calc(int n, int sum, int pro) {
        if (n == 0) {
            return pro - sum;
        }
        int j = n % 10;
        sum += j;
        pro *= j;
        return calc(n / 10, sum, pro);
    }
}