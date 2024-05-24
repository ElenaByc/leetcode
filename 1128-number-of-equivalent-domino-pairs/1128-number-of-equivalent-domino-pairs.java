class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String,Integer> hm = new HashMap<>();
        int n = dominoes.length;
        int cnt = 0;
        
        for (int i = 0; i < n; i++){
            String s1 = "" + dominoes[i][0] + dominoes[i][1];
            String s2 = "" + dominoes[i][1] + dominoes[i][0];
            if (hm.containsKey(s1)){
                cnt += hm.get(s1);
            } else if (hm.containsKey(s2)){
                cnt += hm.get(s2);
            }
            if (s1.equals(s2)) {
                hm.put(s1, hm.getOrDefault(s1,0) + 1);
            } else {
                hm.put(s1, hm.getOrDefault(s1,0) + 1);
                hm.put(s2, hm.getOrDefault(s2,0) + 1);
            }
            
        }
        
        return cnt;
    }
}