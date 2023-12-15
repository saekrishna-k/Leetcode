class Solution {

    public int minOperations(String[] logs) {
        int c = 0;
        for (int i = 0; i < logs.length; i++) {
            switch (logs[i]) {
                case "./":
                    break;
                case "../":
                    c = c == 0 ? 0 : --c;
                    break;
                default:
                    c++;
            }
        }
        return c > 0 ? c : 0;
    }
}
