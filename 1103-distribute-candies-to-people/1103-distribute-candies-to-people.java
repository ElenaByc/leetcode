class Solution {
    public int[] distributeCandies(int candies, int n) {
        int[] result = new int[n];
        int add = 1;
        int i = 0;
        
        while (add < candies) {
            result[i] += add;
            candies -= add;
            i++;
            add++;
            if (i == n) {
                i = 0;
            }
        }
        result[i] += candies;
        
        
        return result;
    }
}