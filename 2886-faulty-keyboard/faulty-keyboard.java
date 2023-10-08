class Solution {
    public String finalString(String s) {
        // String str = "";
        // int lastIndex = 0;
        // for(int j = 0; j < s.length() ; j++){
        //     if(s.charAt(j) == 'i'){
        //         StringBuffer sb = new StringBuffer(s.substring(0,j));
        //         sb.reverse();
        //         str = str + sb.toString();
        //         lastIndex = j;
        //     }
        // }
        // return str + s.substring(lastIndex + 1);

        // StringBuilder res = new StringBuilder();
        // for(var c : s.toCharArray()){
        //     if(c == 'i'){
        //         if(res.length() > 0){
        //             res.reverse();
        //         }
        //     }else{
        //         res.append(c);
        //     }
        // }
        // return res.toString();

         StringBuilder ans=new StringBuilder();
       
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='i') ans.reverse();
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}