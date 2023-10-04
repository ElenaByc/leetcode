class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int pairs = 0;
        
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        for (int cnt : hm.values()) {
            pairs += cnt / 2;
        }
        
        return new int[] {pairs, n - pairs * 2};
    }
}