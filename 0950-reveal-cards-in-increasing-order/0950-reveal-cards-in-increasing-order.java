class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] ans = new int[n];
        int idxD = 0;
        int idxA = 0;
        boolean skip = false;
        
        Arrays.sort(deck);
        

        while (idxD < n) {
            if(ans[idxA] == 0) {
                if (!skip) {
                    ans[idxA] = deck[idxD];
                    idxD++;
                }
                skip = !skip;
            }
            idxA++;
            if (idxA == n) {
                idxA = 0;
            }
        }
        
        return ans;
    }
}