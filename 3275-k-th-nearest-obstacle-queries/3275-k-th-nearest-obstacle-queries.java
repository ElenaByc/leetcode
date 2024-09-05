class Solution {
    public int[] resultsArray(int[][] q, int k) {
        int n = q.length;
        int[] res = new int[n];
        PriorityQueue<Integer> s = new PriorityQueue<>(k, Collections.reverseOrder());

        for (int i = 0; i < n; ++i) {
            s.add(Math.abs(q[i][0]) + Math.abs(q[i][1]));
            if (s.size() < k) {
                res[i] = -1;
            } else if (s.size() > k) {
                s.poll();
                res[i] = s.peek();
            } else {
                res[i] = s.peek();
            }
        }
        
        return res;
    }
}