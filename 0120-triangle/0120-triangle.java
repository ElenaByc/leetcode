class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    int n = triangle.size();
    int[][] results = new int[n][n];
    results[0][0] = triangle.get(0).get(0);

    for (int i = 1; i < n; i++) { //level
       for (int j = 0; j < i + 1; j++) {
          if (j == 0) {
            results[i][j] = triangle.get(i).get(j) + results[i-1][0];
          } else if (j == i) {
            results[i][j] = triangle.get(i).get(j) + results[i-1][i-1];
          } else {
            results[i][j] = triangle.get(i).get(j) + Math.min(results[i-1][j], results[i-1][j-1]);
          }
       }
    }

    // System.out.println(Arrays.deepToString(results));
    int min = results[n-1][0];
    for (int i = 1; i < n; i++) {
      min = Math.min(min, results[n-1][i]);
    }
  
    return min;
    }
}