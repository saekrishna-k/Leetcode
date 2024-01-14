class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> r = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDividing(i)) {
                r.add(i);
            }
        }
        return r;
    }

    static boolean selfDividing(int num) {
        int j = num;
        while (j != 0) {
            if ((j % 10) == 0 || num % (j % 10) != 0) {
                return false;
            }
            j /= 10;
        }
        return true;
    }
}
