class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i : arr) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        // }

        // Set<Integer> set = new HashSet<>(map.values());
        // return set.size() == map.size();

        //     Arrays.sort(arr);
        //     HashSet<Integer> set = new HashSet<>();
        //     int count = 1;
        //     for (int i = 1; i < arr.length; i++) {
        //         if (arr[i] == arr[i - 1]) count++; else {
        //             if (set.contains(count)) return false;
        //             set.add(count);
        //             count = 1;
        //         }
        //     }
        //     if (set.contains(count)) return false;
        //     return true;
        // }



        int[] numberOfOccurrences = new int[2001];
        boolean[] used = new boolean[1001];
        for (int i : arr) {
            numberOfOccurrences[1000 + i]++;
        }

        for (int i : arr) {
            int count = numberOfOccurrences[1000 + i];
            numberOfOccurrences[1000 + i] = 0;
            if (count > 0) {
                if (used[count]) return false; else used[count] = true;
            }
        }
        return true;
    }
}
