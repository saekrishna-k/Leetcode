class Solution {

    public String removeOuterParentheses(String s) {
        // StringBuilder sb = new StringBuilder();
        // int opened = 0;
        // for (char c : s.toCharArray()) {
        //     if (c == '(' && opened++ > 0) sb.append(c);
        //     if (c == ')' && opened-- > 1) sb.append(c);
        // }
        // return sb.toString();

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('(' == c) {
                if (stack.size() > 0) {
                    sb.append(c);
                }
                stack.push(c);
            } else {
                stack.pop();
                if (stack.size() > 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
