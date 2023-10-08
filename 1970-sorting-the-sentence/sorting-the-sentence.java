class Solution {
    public String sortSentence(String s) {
        // String[] arr = s.split(" ");
        // String[] str = new String[arr.length];
        // for(int i = 0 ; i < arr.length ; i++){
        //     String st = arr[i];
        //     int sm = st.charAt(st.length() - 1) - 48;
        //     str[sm - 1] = st.replaceAll("\\d", "");
        // }
        // return String.join(" ",str);

        // String[] st = new String[s.length()];
        // int j = 0;
        // for(int i = 0 ; i < s.length() ; i++){
        //     if(Character.isDigit(s.charAt(i))){
        //         st[s.charAt(i) - 48  - 1] = s.substring(j,i);
        //         j = i + 2;
        //     }
        // }
        // return String.join(" ", st).replaceAll("null","").trim();

        // String[] st = new String[s.split(" ").length];
        // int j = 0;
        // for(int i = 0 ; i < s.length() ; i++){
        //     if(Character.isDigit(s.charAt(i))){
        //         st[s.charAt(i) - 48  - 1] = s.substring(j,i);
        //         j = i + 2;
        //     }
        // }
        // return String.join(" ", st);

        String[] arr = s.split(" ");
        String[] str = new String[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            String st = arr[i];
            int sm = st.charAt(st.length() - 1) - 48;
            str[sm - 1] = st.substring(0,st.length()-1);
        }
        return String.join(" ",str);
    }
}