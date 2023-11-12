class Solution {
    public int distributeCandies(int n, int limit) {
        int result = 0;
        for (int i = 0; i < Math.min(n, limit) + 1; i++) {
            for (int j = 0; j < Math.min(n - i, limit) + 1; j++) {
                if (n - i - j <= limit) {
                    result++;
                }
            }
        }

        return result;
    }
}