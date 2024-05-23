class Solution {

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0, l = seats.length;
        for (int i = 0; i < l; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
}
