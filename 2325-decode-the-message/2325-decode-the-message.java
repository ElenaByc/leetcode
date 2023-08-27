class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> keyTable = new HashMap<>();
        char ch;
        char letter = 'a';
        
        for (int i = 0; i < key.length(); i++) {
            ch = key.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (!keyTable.containsKey(ch)) {
                keyTable.put(ch, letter);
                if (letter == 'z') {
                    break;
                }
                letter++;
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            if (ch == ' ') {
                 result.append(ch);
            } else {
                 result.append(keyTable.get(ch));
            }
        }
        
        return result.toString();
    }
}