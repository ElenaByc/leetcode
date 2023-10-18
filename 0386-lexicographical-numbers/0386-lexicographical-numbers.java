class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        int num = 1;
        
        for (int i = 1; i <= n; i++) {
            result.add(num);
            if (num * 10 <= n) {
                num *= 10;
            } else if (num % 10 != 9 && num + 1 <= n) {
                num++;
            } else {
                while ((num / 10) % 10 == 9) {
                    num /= 10;
                }
                num = num / 10 + 1;
            }
        }
        return result;
    }
}