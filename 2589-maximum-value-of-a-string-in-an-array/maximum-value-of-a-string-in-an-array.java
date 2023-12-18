class Solution {

    public int maximumValue(String[] strs) {
        int m = 0;
        for (int i = 0; i < strs.length; i++) {
            try {
                m = Math.max(m, Integer.parseInt(strs[i]));
            } catch (Exception e) {
                m = Math.max(m, strs[i].length());
            }
        }
        return m;
    }
}
