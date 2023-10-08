class Solution {
    public int findNumbers(int[] nums) {
         int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digitsWithLog(num);
        return numberOfDigits % 2== 0;
        
    }
    
    static int digits(int num){
        if (num < 0){
            num *= -1;
        }
        
        if(num == 0){
            return 1;
        }
        
        int count = 0;
        while (num > 0){
            count++;
            num/=10;
        }
        
        return count;
    }
    
    static int digitsWithLog(int num){
        if (num < 0){
            num *= -1;
        }
        
       int count = (int)(Math.log10(num)) + 1;
       
        return count;
    }
    
    static int digitsWithString(int num){
        if (num < 0){
            num *= -1;
        }
        
        String str = num+"";
        
       int count = str.length();
       
        return count;
    }
    
}