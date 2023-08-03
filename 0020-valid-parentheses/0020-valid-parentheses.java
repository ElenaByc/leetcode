class Solution {
    public boolean isValid(String str) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put('}', '{');
        hm.put(']', '[');
        hm.put('>', '<');

        Stack<Character> stack = new Stack<>();
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (hm.containsValue(ch)) { //open
                stack.add(ch);
            } else if (hm.containsKey(ch)) { //close
                if (stack.isEmpty()) {
                    return false;
                } else if (hm.get(ch) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}