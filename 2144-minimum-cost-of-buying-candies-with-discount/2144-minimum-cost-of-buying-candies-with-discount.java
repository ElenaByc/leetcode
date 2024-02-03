class Solution {
    public int minimumCost(int[] cost) {
        int total = 0;
        int n = cost.length;
        Arrays.sort(cost);
        int i = 0;
        while (i < n) {
            if (i % 3 != 2) {
                total += cost[n - 1 - i];
            } 
            i++;
        }
             
        return total;
    }
}