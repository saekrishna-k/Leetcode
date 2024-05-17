class Solution {

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] a1 = new boolean[101];
        boolean[] a2 = new boolean[101];

        for (int i : nums1) {
            a1[i] = true;
        }

        for (int i : nums2) {
            a2[i] = true;
        }
        int[] result = new int[2];

        for (int i : nums1) {
            if (a2[i]) {
                result[0]++;
            }
        }

        for (int i : nums2) {
            if (a1[i]) {
                result[1]++;
            }
        }

        return result;
    }
}
