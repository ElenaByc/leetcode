class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int slen = s.length();
        int len;
        boolean[] dp = new boolean[slen + 1];
        Arrays.fill(dp, false);
        dp[0] = true;
        
        for(int i = 0; i < slen; i++) {
            if(dp[i] == false) continue;
            for(int j = 0; j < wordDict.size(); j++) {
                len = wordDict.get(j).length();
                if(i + len > slen) continue;
                if(wordDict.get(j).equals(s.substring(i, i + len))) {
                    dp[i + len] = true;
                    if(i + len == slen) return true;
                }
            }
        }
        return dp[slen];
    }
}