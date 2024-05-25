class Solution {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        // Set<Integer> s2 = Arrays.stream(nums2).filter(n -> !s1.contains(n)).boxed().collect(Collectors.toSet());
        // Arrays.stream(nums2).forEach(s1::remove);
        // return Arrays.asList(new ArrayList<>(s1), new ArrayList<>(s2));

        int[] frequency = new int[2001];
        for (int i : nums1) {
            frequency[i + 1000] = 1;
        }

        for (int i : nums2) {
            if (frequency[i + 1000] == 1) {
                frequency[i + 1000] = 3;
            } else if (frequency[i + 1000] == 0) {
                frequency[i + 1000] = 2;
            }
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        for (int i = 0; i < 2001; i++) {
            if (frequency[i] == 1) {
                list1.add(i - 1000);
            } else if (frequency[i] == 2) {
                list2.add(i - 1000);
            }
        }
        return result;
    }
}
