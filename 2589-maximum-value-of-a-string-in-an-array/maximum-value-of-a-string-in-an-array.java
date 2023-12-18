class Solution {

    public int maximumValue(String[] strs) {
        // int m = 0;
        // for (int i = 0; i < strs.length; i++) {
        //     try {
        //         m = Math.max(m, Integer.parseInt(strs[i]));
        //     } catch (Exception e) {
        //         m = Math.max(m, strs[i].length());
        //     }
        // }
        // return m;

        int max = Integer.MIN_VALUE;
        for (String s : strs) {
            int num = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                    num = s.length();
                    break;
                } else {
                    num = num * 10;
                    num += (int) (s.charAt(j) - '0');
                }
            }
            max = Math.max(max, num);
        }
        return max;
    }
}
