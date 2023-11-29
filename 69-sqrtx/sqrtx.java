class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);

        // int i = 0, o = 1;
        // while(x > 0){
        //     x = x - o;
        //     if(x < 0){
        //         return i;
        //     }
        //     o = o + 2;
        //     i++;
        // }
        // return i;

        if(x == 1 || x == 0 ){
            return x;
        }
        int start = 1, end = x, mid = 0;
        while(start <= end){
            mid = start + (end - start) / 2;
            if((long) mid * mid > (long) x){
                end = mid - 1;
            }else if((long) mid * mid < (long) x){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return Math.round(end);
    }
}