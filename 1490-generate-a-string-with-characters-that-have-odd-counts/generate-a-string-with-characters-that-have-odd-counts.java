class Solution {

    public String generateTheString(int n) {
        // return "b" + "ab".substring(n % 2, 1 + n % 2).repeat(n - 1);
        // int count = (n % 2 == 0) ? n - 1 : n;
        // StringBuilder result = new StringBuilder();

        // for (int i = 0; i < count; i++) {
        //     result.append('a');
        // }

        // if (n % 2 == 0) {
        //     result.append('b');
        // }
        // return result.toString();

        StringBuilder result = new StringBuilder();
        int count = n % 2 == 0 ? n-1 : n;
        result.append("a".repeat(count));
        if(count != n) result.append('b');
        return result.toString();
    }
}
