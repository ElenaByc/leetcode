class Solution {
    public List<String> stringSequence(String target) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        
        
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            char currCh = 'a';
            while (currCh <= ch) {
                list.add(sb.toString() + currCh);
                currCh++;
            }
            sb.append(ch);
        }
        
        return list;
    }
}