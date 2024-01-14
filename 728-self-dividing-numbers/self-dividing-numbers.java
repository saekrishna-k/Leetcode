class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> r = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int n = i;
            while (n != 0) {
                int j = n % 10;
                if (j == 0 || i % j != 0) {
                    break;
                }
                n = n / 10;
            }
            if (n == 0) {
                r.add(i);
            }
        }
        return r;
    }
}
