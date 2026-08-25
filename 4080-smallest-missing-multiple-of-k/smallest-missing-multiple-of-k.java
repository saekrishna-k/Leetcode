class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();

        for (int i : nums) {
            h.add(i);
        }
        int curr = k;
        while (h.contains(curr)) {
            curr += k;
        }

        return curr;
    }
}