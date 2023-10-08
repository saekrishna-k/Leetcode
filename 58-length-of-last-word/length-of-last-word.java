class Solution {
    public int lengthOfLastWord(String s) {
        // String[] str = s.split(" ");
        // return str[str.length - 1].length();

        int c = 0;
        int l = s.length() - 1;
        boolean flag = false;
        for(int i = l ; i > -1 ; i--){
            if(s.charAt(i) == ' ' && flag){
                break;
            }
            if(s.charAt(i) != ' '){
                flag = true;
                c++;
            }
        }
        return c;
    }
}