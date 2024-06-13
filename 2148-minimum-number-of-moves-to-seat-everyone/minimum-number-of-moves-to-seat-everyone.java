class Solution {

    public int minMovesToSeat(int[] seats, int[] students) {
        // Arrays.sort(seats);
        // Arrays.sort(students);
        // int moves = 0;
        // for (int i = 0; i < seats.length; i++) {
        //     moves += Math.abs(seats[i] - students[i]);
        // }
        // return moves;

        int[] frequency = new int[101];
        int n = seats.length;
        for (int i = 0; i < n; i++) {
            frequency[seats[i]]++;
            frequency[students[i]]--;
        }
        int result = 0;
        int current = 0;
        for (int i : frequency) {
            result += Math.abs(current);
            current += i;
        }
        return result;
    }
}
