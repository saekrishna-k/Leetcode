class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i : nums1) {
            s.add(i);
        }
        for (int i : nums2) {
            if (s.contains(i)) {
                intersect.add(i);
            }
        }
        // return intersect.stream().mapToInt(Number::intValue).toArray();

        int[] result = new int[intersect.size()];
        int k = 0;
        for (int i : intersect) {
            result[k++] = i;
        }
        return result;
    }
}
