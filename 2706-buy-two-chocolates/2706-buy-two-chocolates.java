class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int min1 = 101;
        int min1Idx = -1;
        int min2 = 101;
        
        for (int i = 0; i < n; i++) {
            if (prices[i] < min1) {
                min1 = prices[i];
                min1Idx = i;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (prices[i] < min2 && i != min1Idx) {
                min2 = prices[i];
            }
        }
        
        if (min1 + min2 <= money) {
            return money - min1 - min2;
        }
        
        return  money;
    }
}