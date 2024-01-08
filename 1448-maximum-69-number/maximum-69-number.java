class Solution {

    public int maximum69Number(int num) {
        // String s = String.valueOf(num);
        // String s1 = "";
        // int i = 0;
        // boolean flag = false;
        // for (i = 0; i < s.length(); i++) {
        //     if (flag == false && s.charAt(i) == '6') {
        //         s1 = s1 + "9";
        //         flag = !flag;
        //     } else {
        //         s1 = s1 + s.charAt(i);
        //     }
        // }
        // return Integer.parseInt(s1);

        String str = Integer.toString(num);
        str = str.replaceFirst("6", "9");
        return Integer.parseInt(str);
    }
}
