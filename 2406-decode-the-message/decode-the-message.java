class Solution {
    public String decodeMessage(String key, String message) {
        //   char[] m = new char[128];
//     m[' '] = ' ';
//     char cur = 'a';
//     for (var k : key.toCharArray())
//         m[k] = m[k] != 0 ? m[k] : cur++;
//     String s = "";
//     for(int i = 0 ; i < message.length(); i++){
//             s = s + String.valueOf(m[message.charAt(i)]);
//     }    
//     return s;
    // return message.chars().mapToObj(i -> String.valueOf(m[i])).collect(Collectors.joining());

    //  StringBuilder ans = new StringBuilder();

    //     HashMap<Character, Character> map = new HashMap<>();

    //     key = key.replace(" ","");
    //     char ch = 'a';
    //     for(char i : key.toCharArray()){
    //         if(map.containsKey(i) == false)
    //             map.put(i,ch++);
    //     }

    //     for(char i : message.toCharArray()){
    //         if(map.containsKey(i))
    //             ans.append(map.get(i));
    //         else
    //             ans.append(i);
    //     }

    //     return ans.toString();


          HashMap<Character,Character> hm=new HashMap<>();
        hm.put(' ', ' ');
        StringBuffer sb=new StringBuffer();
        int j=0;
        for(int i=0;i<key.length();i++){
            char c=key.charAt(i);
            if(c!=' ' && hm.get(c)==null)
                hm.putIfAbsent(c, (char)(97+j++));
        }
           
        for(char c:message.toCharArray())
            sb.append(hm.get(c));
        return sb.toString();
    }
}