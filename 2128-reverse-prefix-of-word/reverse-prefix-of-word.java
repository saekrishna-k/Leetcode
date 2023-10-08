class Solution {
    public String reversePrefix(String word, char ch) {
        //   if(word.indexOf(ch) < 0){
    //       return word;
    //   }
    //   return new StringBuffer(word.substring(0, word.indexOf(ch) + 1)).reverse().toString() + word.substring(word.indexOf(ch) + 1);
      int i = word.indexOf(ch);
      if( i < 0){
          return word;
      }
      StringBuilder sb = new StringBuilder(word.substring(0, i + 1));
      return sb.reverse().toString() + word.substring(i + 1);
    }
}