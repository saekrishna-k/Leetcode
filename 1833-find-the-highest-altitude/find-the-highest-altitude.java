class Solution {

    public int largestAltitude(int[] gain) {
        int maxAltitude = 0, currentAltitude = 0;
        for (int i : gain) {
            currentAltitude += i;
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
}
