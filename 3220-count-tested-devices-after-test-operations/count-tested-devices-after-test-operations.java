class Solution {

    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int i : batteryPercentages) {
            i -= count;
            if (i > 0) {
                count++;
            }
        }

        return count;
    }
}
