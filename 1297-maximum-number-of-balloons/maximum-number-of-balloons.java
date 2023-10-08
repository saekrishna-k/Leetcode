class Solution {
    public int maxNumberOfBalloons(String text) {
    //     int b=0;
    //     int a = 0;
    //     int l = 0;
    //     int o = 0;
    //     int n = 0;
    //     for(int  i = 0 ; i < text.length() ; i++){
    //         switch(text.charAt(i)){
    //             case 'b':
    //                  b++;
    //                  break;
    //             case 'a':
    //                  a++;
    //                  break;
    //             case 'l':
    //                  l++;
    //                  break;
    //             case 'o':
    //                  o++;
    //                  break;   
    //             case 'n':
    //                  n++;
    //                  break;                 
    //         }
    //     }
    //    return Math.min(Math.min(o/2, l/2), Math.min(Math.min(b, a), n));


            final int[][] cache = new int[2][5];
        cache[0][0] = 97;  // a
        cache[0][1] = 98;  // b
        cache[0][2] = 108; // l
        cache[0][3] = 110; // n
        cache[0][4] = 111; // o
        
        // cacl letter frequencies
        for (char ch : text.toCharArray()) {
            final int intValue = ch;
            for (int i = 0; i < 5; i++) {
                if (intValue == cache[0][i]) {
                    cache[1][i]++;
                    break;
                }
            }
        }

        // l & o meet twice
        cache[1][2] /= 2;
        cache[1][4] /= 2;

        // find the bottleneck
        int min = Integer.MAX_VALUE;
        for (int frequency: cache[1]) {
            min = Math.min(min, frequency);
        }

        return min;
    }
}