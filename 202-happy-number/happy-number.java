class Solution {

    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        int a = value(n);

        while (true) {
            if (numbers.contains(a)) {
                return false;
            } else {
                numbers.add(a);
                a = value(a);
                if (a == 1) {
                    return true;
                }
            }
        }
    }

    public static int value(int num) {
        int b = num;
        int result = 0;
        while (b > 0) {
            int c = b % 10;
            result = result + c * c;
            b /= 10;
        }
        System.out.println(result);
        return result;
    }
}
