class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
        int counter = 0;
        int i = 0;
        int n = pairs.length;
        while (i < n) {
            counter++;
            int curEnd = pairs[i][1];
            // look for the next pair
            while (i < n && pairs[i][0] <= curEnd) {
                i++;
            }
        }
        return counter;
    }
}