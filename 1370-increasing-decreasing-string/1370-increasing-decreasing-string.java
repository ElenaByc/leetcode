class Solution {
    public String sortString(String s) {
        int n = s.length();
        char ch;
        int val;
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            val = hm.getOrDefault(ch, 0);
            val++;
            hm.put(ch, val);
        }
        
        
        while (sb.length() < n) {
            for (ch = 'a'; ch <= 'z'; ch++) {
                if (hm.containsKey(ch)) {
                    sb.append(ch);
                    val = hm.get(ch);
                    val--;
                    if (val == 0) {
                        hm.remove(ch);
                    } else {
                        hm.put(ch, val);
                    }
                }
            }
            for (ch = 'z'; ch >= 'a'; ch--) {
                if (hm.containsKey(ch)) {
                    sb.append(ch);
                    val = hm.get(ch);
                    val--;
                    if (val == 0) {
                        hm.remove(ch);
                    } else {
                        hm.put(ch, val);
                    }
                }
            }
        }


        return sb.toString();
    }
}