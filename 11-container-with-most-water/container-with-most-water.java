class Solution {

    public int maxArea(int[] height) {
        //brute force approach
        // int maxAera = 0;
        // for (int i = 0; i < height.length; i++) {
        //     for (int j = i + 1; j < height.length; j++) {
        //         int aera = Math.min(height[i], height[j]) * (j - i);
        //         maxAera = Math.max(maxAera, aera);
        //     }
        // }

        // return maxAera;








        int maxAera = 0, left = 0, right = height.length - 1;
        while (left < right) {
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
