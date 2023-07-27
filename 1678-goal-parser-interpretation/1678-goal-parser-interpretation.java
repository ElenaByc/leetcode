class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char ch;
        for (int i = 0; i < command.length(); i++) {
            ch = command.charAt(i);
            if (ch == 'G') {
                sb.append(ch);
            } else if (ch == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i++;
                } else {
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}