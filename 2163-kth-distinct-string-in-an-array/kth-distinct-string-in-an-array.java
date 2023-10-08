class Solution {
    public String kthDistinct(String[] arr, int k) {
        // List<String> l = Arrays.asList(arr);
        // Map<String, Long> mp = l.stream()
        // .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String, Integer> map = new HashMap<>();
        for(String a : arr)
        map.put(a,map.getOrDefault(a,0)+1);
        int c = 1;
        for(String a : arr) {
            if(map.get(a)==1 && c++ ==k)
                return a;     
        }
        return "";
    }
}