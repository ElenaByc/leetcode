class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for(int i = 0; i < n; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }

        return moves;
    }
}