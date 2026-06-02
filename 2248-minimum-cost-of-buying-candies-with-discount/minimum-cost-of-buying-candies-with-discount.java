class Solution {
    public int minimumCost(int[] cost) {
        // int len = cost.length;

        // Arrays.sort(cost);

        // int totalCost = 0;

        // for (int i = len - 1; i >= 0; i = i - 3) {
        //     totalCost = totalCost + cost[i];
        //     if (i - 1 >= 0) {
        //         totalCost = totalCost + cost[i - 1];
        //     }
        // }
        // return totalCost;

        int len = cost.length;

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        int totalCost = 0;

        for (int item : cost) {
            heap.add(item);
        }

        while (!heap.isEmpty()) {
            int first = heap.poll();
            int second = 0;

            if (!heap.isEmpty()) {
                second = heap.poll();
            }

            if (!heap.isEmpty()) {
                heap.poll();
            }

            totalCost += (first + second);
        }
        return totalCost;
    }
}