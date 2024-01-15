class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> zeroLoss = new HashSet<>();
        Set<Integer> oneLoss = new HashSet<>();
        Set<Integer> moreLoss = new HashSet<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            // Add winner.
            if (!oneLoss.contains(winner) && !moreLoss.contains(winner)) {
                zeroLoss.add(winner);
            }

            // Add or move loser.
            if (zeroLoss.contains(loser)) {
                zeroLoss.remove(loser);
                oneLoss.add(loser);
            } else if (oneLoss.contains(loser)) {
                oneLoss.remove(loser);
                moreLoss.add(loser);
            } else if (moreLoss.contains(loser)) {
                continue;
            } else {
                oneLoss.add(loser);
            }
        }

        List<List<Integer>> answerList = new ArrayList<>();
        List<Integer> oneLossList = new ArrayList<>(oneLoss);
        List<Integer> zeroLossList = new ArrayList<>(zeroLoss);
        Collections.sort(zeroLossList);
        Collections.sort(oneLossList);
        answerList.add(zeroLossList);
        answerList.add(oneLossList);



        return answerList;
    }
}
