class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] ones = new int[n];
        int maxScore = 0;
        int score;
        int zeroes = 0;

        ones[n - 1] = 0; // zero ones to the right of this position
        
        for (int i = n - 2; i >= 0; i --) {
            ones[i] = ones[i + 1] + (s.charAt(i + 1) - '0');
        }
        
        // System.out.println(Arrays.toString(ones));

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                zeroes++;
            }
            score = zeroes + ones[i];
            maxScore = Math.max(maxScore, score);
            
        }
        
        return maxScore;
    }
}