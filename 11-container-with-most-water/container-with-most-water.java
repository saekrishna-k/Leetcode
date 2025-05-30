class Solution {

    public int maxArea(int[] height) {
        int maxAera = 0, left = 0, right = height.length - 1;
        while (left <= right) {
            int aera = Math.min(height[left], height[right]) * (right - left);
            maxAera = Math.max(maxAera, aera);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxAera;
    }
}
