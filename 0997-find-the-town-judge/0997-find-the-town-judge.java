class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] people = new int[n + 1];
        int[] judge = new int[n + 1];
        for (int[] pair : trust) {
            people[pair[0]]++;
            judge[pair[1]]++;
        }
        
        for (int i = 1; i < n + 1; i++) {
            if (judge[i] == n - 1 && people[i] == 0) {
                return i;
            }
        }
        
        return -1;
    }
}