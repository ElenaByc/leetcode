class Solution {
    public int maximumPopulation(int[][] logs) {
        // from 1950 to 2049
        int[] years = new int[100];
        
        for (int[] pair : logs) {
            for (int i = pair[0]; i < pair[1]; i++) {
                years[i - 1950]++;
            }
        }
        
        // System.out.println(Arrays.toString(years));
        int max = -1;
        int maxYear = 1950;
        for (int i = 0; i < 100; i++) {
            if (years[i] > max) {
                max = years[i];
                maxYear = 1950 + i;
            }
        }
         
        return maxYear;
    }
}