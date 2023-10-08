class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        // List<String> r = new ArrayList<>();
        // for(String s : words){
        //     .split("\\"+separator);
        //     for(String s1 : s.split(String.valueOf("["+separator+"]"))){
        //         if(!s1.isEmpty()){
        //             r.add(s1);
        //         }
        //     }
        // }
        // return r;

         ArrayList<String> result = new ArrayList<>();
        for (int i=0; i<words.size(); i++) {
            StringBuilder sb = new StringBuilder();
            String word = words.get(i);
            // System.out.println(word);  
            for(int k=0; k<word.length(); k++){
                char c = word.charAt(k);
                if(c!=separator){
                    sb.append(c);
                }
                else {
                    if (sb.length() > 0) {
                        result.add(sb.toString());
                        sb.setLength(0);
                    }
                }
               
            }
            if (sb.length() > 0) {
                    result.add(sb.toString());
                }
        }
        return result;
    }
}