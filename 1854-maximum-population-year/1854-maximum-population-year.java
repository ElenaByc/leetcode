class Solution {
    public int maximumPopulation(int[][] logs) {
        int max = -1;
        int maxYear = 1950;
        int curr = 0;

        for(int i = 1950; i < 2050; i++) {
            curr = 0;
            for(int[] pair : logs) {
                if (pair[0] <= i) {
                    curr++;
                }
                if (pair[1] <= i) {
                   curr--;
                }
            }
            if (curr > max) {
                max = curr;
                maxYear = i;
            }
        }
         
        return maxYear;
    }
}