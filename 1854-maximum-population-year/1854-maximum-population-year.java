class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        
        for (int[] pair : logs) {
            years[pair[0] - 1950]++;
            years[pair[1] - 1950]--;
        }
        
        int max = years[0];
        int maxYear = 1950;
        
        for(int i = 1 ; i < 101; i++) {
            years[i] += years[i - 1];
            if(years[i] > max) {
                max = years[i];
                maxYear = 1950 + i;
            }
        }
         
        return maxYear;

    }
}