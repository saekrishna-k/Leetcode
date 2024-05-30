class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i : arr) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        // }

        // Set<Integer> set = new HashSet<>(map.values());
        // return set.size() == map.size();

        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) count++; else {
                if (set.contains(count)) return false;

                set.add(count);
                count = 1;
            }
        }

        if (set.contains(count)) return false;
        return true;
    }
}
