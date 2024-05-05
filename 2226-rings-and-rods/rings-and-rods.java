class Solution {

    public int countPoints(String rings) {
        int[] red = new int[10];
        int[] green = new int[10];
        int[] blue = new int[10];
        int l = rings.length();
        for (int i = 0; i < l; i += 2) {
            int ring = rings.charAt(i + 1) - '0';
            if (rings.charAt(i) == 'R') {
                red[ring]++;
            } else if (rings.charAt(i) == 'G') {
                green[ring]++;
            } else if (rings.charAt(i) == 'B') {
                blue[ring]++;
            }
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (red[i] > 0 && green[i] > 0 && blue[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
