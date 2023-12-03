class Solution {
    public int addDigits(int num) {
        // int s = 0;
        // while(num > 0){
        //     s = s + num % 10;
        //     num /= 10;
        //     if(num == 0 && s >= 10){
        //         num = s ;
        //         s = 0;
        //     }
        // }
        // return s;

        // int s = 0;
        // while(num > 0){
        //     s = s + num % 10;
        //     num /= 10;
        // }
        // if(s < 10){
        //     return s;
        // }else{
        //     return addDigits(s);
        // }

         if(num == 0)
          return 0;
         else if(num%9 == 0)
          return 9;
         else
          return num % 9;
    }
}