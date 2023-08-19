class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        Integer num1, num2;
        for (String s : operations) {
            if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                num1 = stack.peek();
                stack.add(num1 * 2);
            } else if (s.equals("+")) {
                num1 = stack.pop();
                num2 = stack.peek();
                stack.add(num1);
                stack.add(num1 + num2);
            } else { // number
                num1 = Integer.parseInt(s);
                stack.add(num1);
            }
        }
        // System.out.println(stack);
        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }
        return sum;
    }
}