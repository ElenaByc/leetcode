class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cnt;
        int sum = 0;
        
        for (int num : nums) {
            cnt = hm.getOrDefault(num, 0);
            cnt++;
            hm.put(num, cnt);
        }
        
        for (int num : nums) {
            if (hm.get(num) == 1) {
                sum += num;
            }
        }
        
        return sum;
    }
}