class Solution {

    public int[] separateDigits(int[] nums) {
        // List<Integer> result = new ArrayList<>();
        // for (int i : nums) {
        //     List<Integer> temp = new ArrayList<>();
        //     int a = i;
        //     while (a > 0) {
        //         temp.add(a % 10);
        //         a /= 10;
        //     }
        //     for (int j = temp.size() - 1; j >= 0; j--) {
        //         result.add(temp.get(j));
        //     }
        // }
        // return result.stream().mapToInt(Integer::intValue).toArray();

        // List<Integer> list = new ArrayList();
        // for (int i = nums.length - 1; i >= 0; i--) {
        //     int temp = nums[i];
        //     while (temp > 0) {
        //         list.add(temp % 10);
        //         temp /= 10;
        //     }
        // }
        // int[] result = new int[list.size()];
        // int index = 0;
        // for (int i = list.size() - 1; i >= 0; i--) {
        //     result[index] = list.get(i);
        //     index++;
        // }
        // return result;

        StringBuilder s = new StringBuilder();
        for (int i : nums) {
            s.append(i);
        }
        int index = 0;
        int[] result = new int[s.length()];
        for (char c : s.toString().toCharArray()) {
            result[index] = c - '0';
            index++;
        }
        return result;
    }
}
