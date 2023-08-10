class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int counter = 0;
        for (int n: nums) {
            counter += map.getOrDefault(n-k, 0) + map.getOrDefault(n+k, 0);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return counter;
    }
}