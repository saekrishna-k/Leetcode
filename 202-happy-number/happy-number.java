class Solution {

    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        int a = nextValue(n);

        // while (true) {
        //     if (numbers.contains(a)) {
        //         return false;
        //     } else {
        //         numbers.add(a);
        //         a = nextValue(a);
        //         if (a == 1) {
        //             return true;
        //         }
        //     }
        // }

        // while (n != 1 && !numbers.contains(n)) {
        //     numbers.add(n);
        //     n = nextValue(n);
        // }
        // return n == 1;

        int slow = n;
        int fast = nextValue(n);

        while (fast != 1 && slow != fast) {
            slow = nextValue(slow);
            fast = nextValue(nextValue(fast));
        }

        return fast == 1;
    }

    private int nextValue(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += +digit * digit;
            num /= 10;
        }
        return sum;
    }
}
