class Solution {
    public boolean hasAlternatingBits(int n) {
        /* int pre = -1,cur = 0;
        while( n != 0)
        {
            cur = n & 1;
            if(cur == pre)
                return false;
            n = n >>> 1;
            pre = cur;
        }
        return true; */
         n = n ^ (n>>1);
        return (n & n+1) == 0; 
    }
}