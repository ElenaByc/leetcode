class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        // dp[i] = minimum characters left for string[0...i-1] with length = i
        // dp[i] = dp[i-1] + 1 (base case, if no match is found)
        // dp[i] = min(dp[i], dp[i - len(s[i..j])]), if the substring is in dictionary

        int n = s.length();
        int[] dp = new int[n + 1];

        HashSet<String> dict = new HashSet<>();

        // for (String str : dictionary) {
        //     dict.add(str);
        // }

        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (String word : dictionary) {
                int len = word.length();
                if (i >= len && s.substring(i - len, i).equals(word)) {
                    dp[i] = Math.min(dp[i], dp[i - len]);
                }
            }

        }

        return dp[n]; // minimum characters left for string[0...n-1] with length = n
    }
}