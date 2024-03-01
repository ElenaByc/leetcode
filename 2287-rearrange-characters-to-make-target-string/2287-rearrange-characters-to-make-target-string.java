class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] arrS = new int[26];
        int[] arrT = new int[26];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            arrS[s.charAt(i) -'a']++;
        }
        
        for (int i = 0; i < target.length(); i++) {
            arrT[target.charAt(i) -'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (arrT[i] > 0) {
                min = Math.min(arrS[i] / arrT[i], min);
                if (min == 0) {
                    return min;
                }
            }
        }
        
        return min;
    }
}