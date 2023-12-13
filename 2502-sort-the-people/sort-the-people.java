class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        // int l = heights.length;
        // Map<Integer, String> m = new HashMap<>();
        // for (int i = 0; i < l; i++) {
        //     m.put(heights[i], names[i]);
        // }
        // Arrays.sort(heights);
        // for (int i = l - 1, j = 0; i > -1; i--, j++) {
        //     names[j] = m.get(heights[i]);
        // }
        // return names;

        //  String[] res = new String[names.length];
        // int[] indexOfNames = new int[100001];
        
        // for(int i = 0; i < heights.length; i++){
        //     indexOfNames[heights[i]] = i;
        // }
            
        // Arrays.sort(heights);
        
        // for(int i = 0; i < heights.length; i++){
        //     res[heights.length - i - 1] = names[indexOfNames[heights[i]]];        
        // }
        
        // return res;    

         String[] result = new String[names.length];
      
    TreeMap < Integer, String > map = new TreeMap < > (Collections.reverseOrder());

    for (int i = 0; i < names.length; i++) {
      map.put(heights[i], names[i]);           // Heights in descending order
    }

    int i = 0;
    for (int h: map.keySet()) {
      result[i++] = map.get(h);               // Iterate TreeMap
    }

    return result;
    }
}
