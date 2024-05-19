class Solution {

    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
            List<Integer> temp = new ArrayList<>();
            int a = i;
            while (a > 0) {
                temp.add(a % 10);
                a /= 10;
            }
            for (int j = temp.size() - 1; j >= 0; j--) {
                result.add(temp.get(j));
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
