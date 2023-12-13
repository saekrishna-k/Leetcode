class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        int l = heights.length;
        Map<Integer, String> m = new HashMap<>();
        for (int i = 0; i < l; i++) {
            m.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = l - 1, j = 0; i > -1; i--, j++) {
            names[j] = m.get(heights[i]);
        }
        return names;
    }
}
