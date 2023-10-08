class Solution {
    public String longestCommonPrefix(String[] strs) {
          if (strs == null || strs.length == 0) {
            return "";
        }
        //  StringBuilder ans = new StringBuilder();
        // Arrays.sort(strs);
        // String first = strs[0];
        // String last = strs[strs.length-1];
        // for (int i=0; i<Math.min(first.length(), last.length()); i++) {
        //     if (first.charAt(i) != last.charAt(i)) {
        //         return ans.toString();
        //     }
        //     ans.append(first.charAt(i));
        // }
        // return ans.toString();

        //  Arrays.sort(strs);
        // String s1 = strs[0];
        // String s2 = strs[strs.length-1];
        // int idx = 0;
        // while(idx < s1.length() && idx < s2.length()){
        //     if(s1.charAt(idx) == s2.charAt(idx)){
        //         idx++;
        //     } else {
        //         break;
        //     }
        // }
        // return s1.substring(0, idx);

        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}