class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        int n = word.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        
        while (i < n) {
            while (i < n && !(word.charAt(i) >= '0' && word.charAt(i) <= '9')) {
                i++;
            }
            while (i < n && (word.charAt(i) >= '0' && word.charAt(i) <= '9')) {
                sb.append(word.charAt(i));
                i++;
            }
            if (sb.length() > 0) {
                int j = 0;
                while (j < sb.length() && sb.charAt(j) == '0') {
                    j++;
                }
                if (j == sb.length()) {
                    set.add("0");
                } else {
                    set.add(sb.substring(j).toString());
                }
                sb.setLength(0);
            }
        }
        
        return set.size();
    }
}