class Solution {
    public int maximumPopulation(int[][] logs) {
        int startYear = 2050;
        int endYear = 1950;
        
        for (int[] pair : logs) {
            startYear = Math.min(startYear, pair[0]);
            endYear = Math.max(endYear, pair[1]);
        }
        
        int n = endYear - startYear;
        
        int max = -1;
        int maxYear = 0;
        int[] years = new int[n];
        
        for (int[] pair : logs) {
            for (int i = pair[0]; i < pair[1]; i++) {
                years[i - startYear]++;
            }
        }
        
        // System.out.println(Arrays.toString(years));

        for (int i = startYear; i < endYear; i++) {
            if (years[i - startYear] > max) {
                max = years[i- startYear];
                maxYear = i;
            }
        }
         
        return maxYear;
    }
}