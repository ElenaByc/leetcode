class Solution {
    public int countLargestGroup(int n) {
        int maxVal = 0;
        int val;
        int sum;
        int num;
        int result = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 1; i <= n; i++) {
            sum = 0;
            num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        
        for (int key : hm.keySet()) {
            val = hm.get(key);
            if (val > maxVal) {
                maxVal = val;
                result = 1;
            } else if (val == maxVal) {
                result++;
            }
        }
        
        return result;
    }
}