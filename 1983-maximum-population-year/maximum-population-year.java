class Solution {

    public int maximumPopulation(int[][] logs) {
        int[] count = new int[101];
        for (int[] i : logs) {
            count[i[0] - 1950]++;
            count[i[1] - 1950]--;
        }
        int max = count[0], year = 1950;
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
            if (count[i] > max) {
                max = count[i];
                year = 1950 + i;
            }
        }
        return year;
    }
}
