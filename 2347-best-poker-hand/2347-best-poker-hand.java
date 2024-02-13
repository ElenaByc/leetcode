class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        if (suits[1] == suits[0] && suits[2] == suits[0] && suits[3] == suits[0] && suits[4] == suits[0]) {
            return "Flush";
        }
        Map<Integer, Integer> hm = new HashMap<>();
        for (int rank : ranks) {
            hm.put(rank, hm.getOrDefault(rank, 0) + 1);
            if (hm.get(rank) == 3) {
                return "Three of a Kind";
            }
        }
        for (int key : hm.keySet()) {
            if (hm.get(key) == 2) {
                return "Pair";
            }
        }
        
        return "High Card";
    }
}