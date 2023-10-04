class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = prices[i] - getDiscount(i, prices);
        }
        
        return answer;
    }
    
    public int getDiscount(int i, int[] prices) {
        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] <= prices[i]) {
                return prices[j];
            }
        }
        return 0;
    }
    
}