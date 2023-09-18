class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length; // number of rows
        int n = mat[0].length;
        int[] res = new int[k];
        int[] sums = new int[m];
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        List<Integer> list;
        int sum;
        
        for (int i = 0; i < m; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += mat[i][j];
            }
            if (hm.containsKey(sum)) {
                hm.get(sum).add(i);
            } else {
                list = new ArrayList<>();
                list.add(i);
                hm.put(sum, list);
            }
            sums[i] = sum;
        }

        Arrays.sort(sums);
        // System.out.println(hm);
        
        int i = 0;
        int j = 0;
        while (i < k) {
            if (hm.containsKey(sums[j])) {
                list = hm.get(sums[j]);
                hm.remove(sums[j]);
                // System.out.println(list);
                for (int a = 0; a < list.size() && i < k; a++) {
                    res[i] = list.get(a);
                    i++;
                }
            }
            j++;
        }
    
    
        return res;
    }
}