class Solution {

    public int maxDepth(String s) {
        int open = 0, depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') depth = Math.max(depth, ++open);
            if (s.charAt(i) == ')') open--;
        }
        return depth;
    }
}
