class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[] scoreSorted = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int rank;
        for (int i = 0; i < n; i++) {
            scoreSorted[i] = score[i];
        }
        Arrays.sort(scoreSorted);
        for (int i = 0; i < n; i++) {
            hm.put(scoreSorted[i], n - i);
        }
        
        for (int i = 0; i < n; i++) {
            rank = hm.get(score[i]);
            switch (rank) {
                case 1:
                    result[i] = "Gold Medal";
                    break;
                case 2:
                    result[i] = "Silver Medal";
                    break;
                case 3:
                    result[i] = "Bronze Medal";
                    break;
                default:
                    result[i] = "" + rank;
            }
        }
        
        return result;
    }
}