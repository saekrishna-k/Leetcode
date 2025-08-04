class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> hm.get(n1) - hm.get(n2));

        for (int n : hm.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        int[] result = new int[k];
        for (int i = k - 1; i > -1; i--) {
            result[i] = heap.poll();
        }

        return result;
    }
}