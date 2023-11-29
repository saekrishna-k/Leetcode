class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);
        int i = 0, o = 1;
        while(x > 0){
            x = x - o;
            if(x < 0){
                return i;
            }
            o = o + 2;
            i++;
        }
        return i;
    }
}