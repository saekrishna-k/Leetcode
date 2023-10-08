class Solution {
    public boolean judgeCircle(String moves) {
        // long u1 = moves.chars().filter(s -> s == 'U').count();
        // long d1 = moves.chars().filter(s -> s == 'D').count();
        // long l1 = moves.chars().filter(s -> s == 'L').count();
        // long r1 = moves.chars().filter(s -> s == 'R').count();
        // return (d1-u1) == 0 ? ((r1-l1) == 0 ? true : false) : false;
        // int c1=0;
        // int c2=0;
        // for(int i = 0; i < moves.length() ; i++){
        //     // char c = moves.charAt(i);
        //     switch(moves.charAt(i)){
        //         case 'U':
        //             c1++;
        //             break;
        //         case 'D':
        //             c1--;
        //             break;    
        //         case 'R':
        //             c2++;
        //             break;
        //         case 'L':
        //             c2--;
        //             break;               
        //     }
        // }
        // if(c1==0 && c2==0){
        //     return true;
        // }else{
        //     return false;
        // }
        // int x = 0, y = 0;
        // for (char move : moves.toCharArray()) {
        //     if (move == 'U') y++;
        //     if (move == 'D') y--;
        //     if (move == 'L') x--;
        //     if (move == 'R') x++;
        // }
        // return x == 0 && y == 0;
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'U') y++;
            else if (move == 'D') y--;
            else if (move == 'L') x--;
            else x++;
        }
        return x == 0 && y == 0;
    }
}