class Solution {
    public String replaceDigits(String s) {
        // String r = String.valueOf(s.charAt(0));
        // for(int i = 1 ; i < s.length() ; i++){
        //     if(Character.isDigit(s.charAt(i))){
        //         r = r + (char) ( s.charAt(i - 1) + s.charAt(i) - 48);
        //     }else{
        //         r = r + s.charAt(i);
        //     }
        // }
        // return r;
        char[] charArray = s.toCharArray();
		for(int i = 1; i<charArray.length; i = i + 2) {
		  charArray[i] = (char) (charArray[i - 1] + charArray[i] - '0');
		}
		return String.valueOf(charArray);
    }
}