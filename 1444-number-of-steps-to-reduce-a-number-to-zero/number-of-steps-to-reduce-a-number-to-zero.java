class Solution {

    public int numberOfSteps(int num) {
        // int c = 0;
        // while (num > 0) {
        //     if (num % 2 == 0) {
        //         num /= 2;
        //     } else {
        //         num -= 1;
        //     }
        //     c++;
        // }
        // return c;

        if(num == 0){
            return 0;
        }
        return 1 + numberOfSteps((num & 1) == 1 ? num - 1 : num >> 1);
    }
}
