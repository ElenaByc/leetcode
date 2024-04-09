class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int num = tickets[k];
        int time = 0;
        for (int i = 0; i < tickets.length; i ++) {
            if (i <= k) {
                if (tickets[i] >= num) {
                    time += num;
                } else {
                    time += tickets[i];
                }
            } else {
                if (tickets[i] >= num - 1) {
                    time += num - 1;
                } else {
                    time += tickets[i];
                }
            }
        }
        
        return time;
    }
}