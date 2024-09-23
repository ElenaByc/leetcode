class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> banned = new HashSet<>();
        for (var s : bannedWords) {
            banned.add(s);
        }
        
        int cnt = 0;
        
        for (var s : message) {
            if (banned.contains(s)) {
                cnt++;
                if (cnt >= 2) {
                    return true;
                }
            }
        }
        
        return cnt == 2;
    }
}