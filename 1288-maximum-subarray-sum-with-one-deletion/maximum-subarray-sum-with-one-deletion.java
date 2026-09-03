class Solution {
    public int maximumSum(int[] arr) {
        int l = arr.length;
        int maxNoDelete = arr[0];
        int maxSum = arr[0];
        int maxOneDelete = arr[0];

        for(int i = 1 ; i < l ; i++){
            int prevNoDelete = maxNoDelete;
            maxNoDelete = Math.max(maxNoDelete + arr[i], arr[i]);

            maxOneDelete = Math.max(maxOneDelete + arr[i], prevNoDelete);

            maxSum = Math.max(maxSum, Math.max(maxNoDelete, maxOneDelete));
        }

        return maxSum;
    }
}