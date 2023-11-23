class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
    

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> row;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(grid[i][j]);
            }
        }
        k = k % (m * n);
        int idx = m * n - k;
        if (k == 0) {
            idx = 0;
        }
        for (int i = 0; i < m; i++) {
            row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(list.get(idx));
                idx++;
                if (idx == m * n) {
                    idx = 0;
                }
            }
            result.add(row);
        }
        
        return result;
    }
}