class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> list = new ArrayList<>();
        int m = rounds.length;
        int start = rounds[0];
        int end = rounds[m-1];

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                list.add(i);
            }
            return list;
        }
        for (int i = 1; i <= end; i++) {
            list.add(i);
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
        }
     
        return list;
    }
}