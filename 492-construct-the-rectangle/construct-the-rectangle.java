class Solution {

    public int[] constructRectangle(int area) {
        // int m = (int) Math.sqrt(area);
        // while (area % m != 0) {
        //     m--;
        // }
        // return new int[] { area / m, m };

        int l = (int) Math.sqrt(area);
        for (int i = l; i >= 1; i--) {
            if (area % i == 0) {
                int w = area / i;
                return new int[] { w, i };
            }
        }
        return new int[] {};
    }
}
