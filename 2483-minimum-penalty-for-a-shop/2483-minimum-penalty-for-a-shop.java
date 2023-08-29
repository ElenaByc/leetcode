class Solution {
    public int bestClosingTime(String customers) {
        int maxProfit = 0;
        int profit = 0;
        int minIndex = 0;
        
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                profit++;
            } else {
                profit--;
            }
            if (profit > maxProfit) {
                maxProfit = profit;
                minIndex = i + 1;
            }
        }
        return minIndex;
    }
}