class Solution {

    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];
        int l = matches.length;
        for (int i = 0; i < l; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];
            if (losses[winner] == 0) {
                losses[winner] = -1;
            }
            if (losses[loser] == -1) {
                losses[loser] = 1;
            } else {
                losses[loser]++;
            }
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < 100001; i++) {
            if (losses[i] == -1) {
                zeroLoss.add(i);
            } else if (losses[i] == 1) {
                oneLoss.add(i);
            }
        }
        result.add(zeroLoss);
        result.add(oneLoss);
        return result;
    }
}
