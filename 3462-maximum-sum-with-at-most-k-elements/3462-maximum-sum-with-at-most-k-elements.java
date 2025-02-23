class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int n = grid.length;
        int m = grid[0].length;
        long max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int[] row = grid[i];
            Arrays.sort(row);
            for (int j = 0; j < limits[i]; j++) {
                list.add(row[m - 1 - j]);
            }
        }
        
        Collections.sort(list);
        n = list.size();
        
        for (int i = 0; i < k; i++) {
            max += list.get(n - 1 - i);
        }
        
        return max;
    }
}