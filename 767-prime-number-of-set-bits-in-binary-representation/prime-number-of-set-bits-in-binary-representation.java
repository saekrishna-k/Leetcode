class Solution {

    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        HashSet<Integer> prime = new HashSet<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        prime.add(7);
        prime.add(11);
        prime.add(13);
        prime.add(17);
        prime.add(19);
        prime.add(23);
        prime.add(29);
        prime.add(31);
        for (int i = left; i <= right; i++) {
            // if (prime.contains(countBits(i))) {
            //     result++;
            // }
            if (isprime(countBits(i))) {
                result++;
            }
        }
        return result;
    }

    private static int countBits(int n) {
        int count = 0;
        // while (n > 0) {
        //     count += n & 1;
        //     n >>= 1;
        // }
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    private static boolean isprime(int n) {
        if (n == 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
