class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> r = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int n = i;
            boolean flag = false;
            while (n != 0) {
                int j = n % 10;
                if (j == 0) {
                    flag = !flag;
                    break;
                } else if (j != 0 && i % j != 0) {
                    flag = !flag;
                    break;
                }
                n = n / 10;
            }
            if (!flag) {
                r.add(i);
            }
        }
        return r;
    }
}
