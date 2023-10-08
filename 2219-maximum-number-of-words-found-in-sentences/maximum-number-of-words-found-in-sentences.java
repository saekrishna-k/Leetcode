class Solution {
    public int mostWordsFound(String[] sentences) {
    //     int result = 0;
    //     for(int i=0 ; i< sentences.length ; i++){
    //  result = sentences[i].split(" ").length > result ? sentences[i].split(" ").length : result;
    //     }
    //     return result;
     int max = 0;
        for (String s: sentences) {
            max = Math.max(max, s.split(" ").length);
        }
        return max;
        // return 1 + Stream.of(sentences).mapToInt(s -> (int)s.chars().filter(ch -> ch == ' ').count()).max().getAsInt();
    }
}