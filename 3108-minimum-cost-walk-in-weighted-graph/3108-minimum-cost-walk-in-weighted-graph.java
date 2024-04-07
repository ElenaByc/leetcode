class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        var visited = new int[n];
        Arrays.fill(visited, -1);
        var dist = new int[n];
        var hm = new ArrayList<ArrayList<int[]>>(n);
        
        for (int i = 0; i < n; i++) {
            hm.add(new ArrayList<int[]>());
        }
        
        for (var edge : edges) {
            hm.get(edge[0]).add(edge);
            if(edge[0] != edge[1]) {
                hm.get(edge[1]).add(edge);
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (visited[i] >= 0) {
                continue;
            }
            int d = -1;
            var list = new ArrayList<Integer>();
            list.add(i);
            while (!list.isEmpty()) {
                int e = list.remove(list.size() - 1);
                visited[e] = i;
                for (int[] edge : hm.get(e)) {
                    d &= edge[2];
                    if(visited[edge[0]] < 0) {
                        list.add(edge[0]);
                    } else if(visited[edge[1]] < 0) {
                        list.add(edge[1]);
                    }
                }
            }
            dist[i] = (d == -1) ? 0 : d;            
        }

        var res = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            if (query[i][0] == query[i][1]) {
                res[i] = 0;
            }
            else if(visited[query[i][0]] == visited[query[i][1]]) {
                res[i] = dist[visited[query[i][0]]];
            } else {
                res[i] = -1;
            }
        }
        
        return res;
    }
}