class Solution {
    public String removeTrailingZeros(String num) {
       // BigInteger bn = new BigInteger(Long.parseLong(num));
        // // long n = Long.parseLong(num);
        // while(bn > 0){
        //     long l = bn % 10;
        //     if(l == 0){
        //         bn = bn / 10;
        //     }else{
        //         break;
        //     }
        // }
        // return String.valueOf(bn);
        // for(int i = num.length - 1; i > -1 ; i--){
        //     if(Integer.paseInt(s.charAt(i)) == 0){
        //             num = num
        //     }else{
        //         break;
        //     }
        // }
        int  l = num.length() - 1;
        while( l>= 0 && num.charAt(l) == '0'){
            l--;
        }
        return num.substring(0, l+1); 
    }
}