class Solution {
    public String interpret(String command) {
         String result = "";
        for(int i=0 ; i<command.length() ; i++){
            if('G' == command.charAt(i)){
                result = result + "G";
            } else if( ('(' == command.charAt(i)) && (')' == command.charAt(i+1))){
                 result = result + "o";
            }else if(('(' == command.charAt(i)) && ('a' == command.charAt(i+1))){
                 result = result + "al";
            }
        }
        return result;
        // return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}