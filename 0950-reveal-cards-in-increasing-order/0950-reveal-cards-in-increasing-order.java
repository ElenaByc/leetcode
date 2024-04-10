class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] ans = new int[n];
        int idx;
        Queue<Integer> q = new LinkedList<>();
        
        Arrays.sort(deck);
        
        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        
        for (int i = 0; i < n; i++) {
            // step1
            idx = q.poll();
            ans[idx] = deck[i];
            // step2
            if (!q.isEmpty()) {
                idx = q.poll();
                q.add(idx);
            }
        }
        
        return ans;
    }
}