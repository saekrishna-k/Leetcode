class Solution {

    public int countKeyChanges(String s) {
        String str = s.toLowerCase();
        int count = 0, l = str.length();
        for (int i = 0; i < l - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
