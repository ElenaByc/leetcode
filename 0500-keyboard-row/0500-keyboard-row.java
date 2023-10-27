class Solution {
    public String[] findWords(String[] words) {
        Set<Character> row1 = Set.of('q','w','e','r','t','y','u','i','o','p');
        Set<Character> row2 = Set.of('a','s','d','f','g','h','j','k', 'l');
        Set<Character> row3 = Set.of('z','x','c','v','b','n','m');
        ArrayList<String> list = new ArrayList<>();
        
        for (String word : words) {
            if (canTypeWithRow(word, row1) || canTypeWithRow(word, row2) || canTypeWithRow(word, row3)) {
                list.add(word);
            }
        }
        
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    
    public boolean canTypeWithRow(String word, Set row) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (!row.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}