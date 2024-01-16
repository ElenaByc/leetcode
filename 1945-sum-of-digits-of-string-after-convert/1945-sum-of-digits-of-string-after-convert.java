class Solution {
    public int getLucky(String s, int k) {
        int n = s.length();
        int sum = 0;
        int num;
        int cnt = 1;
        
        for (int i = 0; i < n; i++) {
            num = s.charAt(i) - 'a' + 1;
            if (num < 10) {
                sum += num;
            } else {
                sum += (num % 10 + num / 10);
            }
            
        }
        
        while (cnt < k) {
            num = sum;
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            cnt++;
        }
        
        return sum;
    }
}