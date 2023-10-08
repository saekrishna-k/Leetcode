class Solution {
    public boolean digitCount(String num) {
       // Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        // m.put(0,0);
        // m.put(1,0);
        // m.put(2,0);
        // m.put(3,0);
        // m.put(4,0);
        // m.put(5,0);
        // m.put(6,0);
        // m.put(7,0);
        // m.put(8,0);
        // m.put(9,0);
        // for(int i = 0; i < num.length() ; i++){
        //     int j = Integer.valueOf(num.charAt(i)) - 48;
        //     if(m.containsKey(j)){
        //          m.put(j,m.get(j)+1);
        //          System.out.println(j+" "+m.get(j));
        //     }else{
        //          m.put(j,1);
        //          System.out.println(j+" "+m.get(j));
        //     }
        // }
        // boolean r = false;
        // for(int i = 0; i<num.length() ; i++){
        //     int j = (int)num.charAt(i) - 48;
        //     // System.out.println(i+" "+m.get(i));
        //     if(m.containsKey(i) && j == m.get(i)){
        //         r = true;
        //     }else{
        //         return false;
        //     }
        // }
        int[] f = new int[10];
        int l = num.length();
        for(int i = 0; i < l; i++){
            f[num.charAt(i) - '0']++;
        }
        for(int i = 0 ; i < l ; i++){
            if(f[i] != (num.charAt(i) - '0')){
                return false;
            }
        }
        return true; 
    }
}