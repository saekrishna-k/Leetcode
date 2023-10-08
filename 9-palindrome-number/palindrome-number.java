class Solution {
    public boolean isPalindrome(int x) {
        int r=0,n=x;
        if(x==10||x<0)
            return false;
        else
        {
            while(x>0)
            {
                r=r*10+x%10;
                x/=10;  
            }
            if(r==n)
                return true;
            else
                return false;
        }
    }
}