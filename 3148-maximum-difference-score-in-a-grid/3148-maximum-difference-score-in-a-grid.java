class Solution {
    public int maxScore(List<List<Integer>> grid) {
        int m = grid.size();
        int n = grid.get(0).size();
        int maxScore = Integer.MIN_VALUE;
		
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int min = Math.min(
                    i > 0 ? grid.get(i - 1).get(j) : 1000000,
                    j > 0 ? grid.get(i).get(j - 1) : 1000000
                );
                maxScore = Math.max(maxScore, grid.get(i).get(j) - min);
                if (min < grid.get(i).get(j)) {
                    grid.get(i).set(j, min);
                }
            }
        }
    
        return maxScore;
    }
}