class Solution {

    public List<String> commonChars(String[] words) {
        int n = words.length;
        int[] common = new int[26];
        int[] current = new int[26];
        List<String> result = new ArrayList<>();

        for (char ch : words[0].toCharArray()) {
            common[ch - 'a']++;
        }

        for (int i = 1; i < n; i++) {
            Arrays.fill(current, 0);
            for (char ch : words[i].toCharArray()) {
                current[ch - 'a']++;
            }
            for (int ch = 0; ch < 26; ch++) {
                common[ch] = Math.min(common[ch], current[ch]);
            }
        }
        
        for (int ch = 0; ch < 26; ch++) {
            for ( int i = 0; i < common[ch]; i++) {
                result.add(String.valueOf((char) (ch + 'a')));
            }
        }

        return result;
    }
}