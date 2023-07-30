class Solution {
    public int countDigits(int num) {
        if (num < 10) return 1;
        int result = 0;
        int digit;
        int number = num;
        Set<Integer> set = new HashSet<>();
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            if (!set.contains(digit)) {
                if (num % digit == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}