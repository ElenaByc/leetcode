class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        if (suits[1] == suits[0] && suits[2] == suits[0] && suits[3] == suits[0] && suits[4] == suits[0]) {
            return "Flush";
        }
        int[] arr = new int[13];
        int max = 0;
        
        for (int rank : ranks) {
            arr[rank - 1]++;
            if (arr[rank - 1] == 3) {
                return "Three of a Kind";
            }
            max = Math.max(max, arr[rank- 1]);
        }
        if (max == 2) {
            return "Pair";
        }
        
        return "High Card";
    }
}