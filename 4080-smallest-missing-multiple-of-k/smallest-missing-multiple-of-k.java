class Solution {
    public int missingMultiple(int[] nums, int k) {
        // HashSet<Integer> h = new HashSet<>();

        // for (int i : nums) {
        //     h.add(i);
        // }
        // int curr = k;
        // while (h.contains(curr)) {
        //     curr += k;
        // }

        // return curr;

        boolean[] present = new boolean[101];

        for (int num : nums) {
            present[num] = true;
        }

        for (int multiple = k;; multiple += k) {
            if (multiple > 100 || !present[multiple]) {
                return multiple;
            }
        }
    }
}