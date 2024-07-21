class Solution {
    public String losingPlayer(int x, int y) {
        while (x >= 1 && y >= 4) {
            // alice
            x -= 1;
            y -= 4;
            // bob
            if (x < 1 || y < 4) {
                return "Alice";
            }
            x -= 1;
            y -= 4;
        }
        return "Bob";
    }
}