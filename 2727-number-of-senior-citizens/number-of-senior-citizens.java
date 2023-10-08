class Solution {
    public int countSeniors(String[] details) {
        // int r = 0;
        // for(int i = 0 ; i < details.length ; i++){
        //     if(Integer.parseInt(details[i].substring(11,13)) > 60){
        //         r++;
        //     }
        // }
        // return r;
         int count = 0;
        int age;
        for(String x : details) {
            age = (x.charAt(11) - '0') * 10 + x.charAt(12) - '0';
            count += age > 60 ? 1 : 0;
        }
        return count;
    }
}