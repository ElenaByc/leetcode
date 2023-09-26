class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        boolean[] taken = new boolean[26]; // if character is present in current result Stack
        int[] dict = new int[26]; // number of occurences of character

        // count letters
        for (int i = 0; i < s.length(); i++) {
            dict[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            dict[ch - 'a']--;
            if(taken[ch - 'a']) { //if character is already present in stack, dont bother
                continue;
            } 
            while (!stack.isEmpty() && 
                   stack.peek() > ch && 
                   dict[stack.peek() - 'a'] > 0 ) {
                taken[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            taken[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}