class Solution {
    public boolean isValid(String str) {
        HashMap<Character, Character> close = new HashMap<>();
        close.put(')', '(');
        close.put('}', '{');
        close.put(']', '[');
        
        Set<Character> open = new HashSet<>();
        open.add('(');
        open.add('{');
        open.add('[');
        
        Stack<Character> stack = new Stack<>();
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (open.contains(ch)) {
                stack.add(ch);
            } else if (close.containsKey(ch)) {
                if (stack.isEmpty()) {
                    return false;
                } else if (close.get(ch) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}