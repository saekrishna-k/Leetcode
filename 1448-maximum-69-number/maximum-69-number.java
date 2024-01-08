class Solution {

    public int maximum69Number(int num) {
        // String s = String.valueOf(num);
        // String s1 = "";
        // int i = 0, l = s.length();
        // boolean flag = false;
        // for (i = 0; i < l; i++) {
        //     if (flag == false && s.charAt(i) == '6') {
        //         s1 = s1 + "9";
        //         flag = !flag;
        //     } else {
        //         s1 = s1 + s.charAt(i);
        //     }
        // }
        // return Integer.parseInt(s1);

        // String numStr = String.valueOf(num);
        // int first6Idx = numStr.indexOf("6");
        // if (first6Idx == -1) {
        //     return num;
        // }
        // return Integer.valueOf(numStr.substring(0, first6Idx) + 9 + numStr.substring(first6Idx + 1));

        // String str = Integer.toString(num);
        // str = str.replaceFirst("6", "9");
        // return Integer.parseInt(str);

        String temp = Integer.toString(num);
        char ch[] = temp.toCharArray();
        int i = 0;
        for (char c : ch) {
            if (c == '6') {
                ch[i] = '9';
                break;
            }

            i++;
        }
        String ans = new String(ch);
        return Integer.valueOf(ans);
    }
}
