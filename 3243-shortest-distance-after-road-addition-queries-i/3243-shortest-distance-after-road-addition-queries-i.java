class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int q = queries.length;
        int[] dist = new int[q];
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        ArrayList<Integer> list;
        int[] minToEnd = new int[n];
        
        for (int i = 0; i < n - 1; i++) {
            list = new ArrayList<>();
            list.add(i + 1);
            pairs.add(list);
            minToEnd[i] = n - 1 - i;
        }
        minToEnd[n - 1] = 0;
        
        for (int i = 0; i < q; i++) {
            // System.out.println(Arrays.toString(minToEnd));
            int u = queries[i][0];
            int v = queries[i][1];
            if (u == 0 && v == n - 1) {
                for (int j = i; j < q; j++) {
                    dist[j] = 1;
                }
                return dist;
            }
            list = pairs.get(u);
            list.add(v);
            pairs.set(u, list);
            minToEnd[u] = Math.min(minToEnd[u], 1 + minToEnd[v]);
            for (int j = u - 1; j >= 0; j--) {
                for (int k : pairs.get(j)) {
                    minToEnd[j] = Math.min(minToEnd[j], 1 + minToEnd[k]);
                }
            }
            dist[i] = minToEnd[0];
        }
        
        return dist;
    }
    
}