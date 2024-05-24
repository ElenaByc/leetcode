class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] arr = new int[100];
        int cnt = 0;
        int num;
        
        for (int i = 0; i < dominoes.length; i++) {
            if (dominoes[i][0] <= dominoes[i][1]) {
                num = dominoes[i][0] * 10 + dominoes[i][1];
            } else {
                num = dominoes[i][1] * 10 + dominoes[i][0];
            }
            cnt += arr[num];
            arr[num]++;
        }
        
        return cnt;
    }
}