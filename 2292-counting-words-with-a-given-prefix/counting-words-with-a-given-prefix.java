class Solution {
    public int prefixCount(String[] words, String pref) {
         // short c = 0;
        // for(short i = 0; i < words.length ; i++){
        //     if(words[i].length() >= pref.length() && pref.equals(words[i].substring(0,pref.length()))){
        //         c++;
        //     }
        // }
        // return c;

        short c = 0;
        for(short i = 0 ; i <  words.length ; i++){
            if(words[i].startsWith(pref)){
                c++;
            }
        }
    return c;

    // return (int) Arrays.stream(words).filter(w -> w.startsWith(pref)).count(); 
    }
}