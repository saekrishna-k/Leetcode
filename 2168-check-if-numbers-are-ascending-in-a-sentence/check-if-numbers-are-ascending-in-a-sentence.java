class Solution {
    public boolean areNumbersAscending(String s) {
        // String[] str = s.split(" ");
        // int num = 0;
        // for(int i = 0 ; i < str.length ; i++){
        //     if(Character.isDigit(str[i].charAt(0))){
        //         if(Integer.parseInt(str[i]) <= num){
        //             return false;
        //         }
        //         num = Integer.parseInt(str[i]);
        //         System.out.println(num);
        //     }
        // }
        // return true;

        int min = 0;
        boolean lastNb = false;
        int tmp = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                lastNb = true;
                tmp = tmp * 10 + (c - '0');
            } else if (lastNb) {
                if (min >= tmp) {
                    return false;
                }
                lastNb = false;
                min = tmp;
                tmp = 0;
            }
        }
        if (lastNb)
            return tmp > min;
        return true;
    }
}