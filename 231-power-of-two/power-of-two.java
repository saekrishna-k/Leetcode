class Solution {
    public boolean isPowerOfTwo(int n) {
        // return n > 0 && n != 0 && (n & (n-1)) == 0;

        if(n <= 0){
            return false;
        }

        while(n > 0){
            if(n == 1){
            return true;
            }
            if(n % 2 != 0){
                return false;
            }else{
                n /= 2;
            }
            System.out.println(n);
        }
        return true;
    }
}