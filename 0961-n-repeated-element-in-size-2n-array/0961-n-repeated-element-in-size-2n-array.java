class Solution {
    public int repeatedNTimes(int[] nums) {
        // HashMap<Integer, Integer> hm = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return num;
            set.add(num);
        }
        return 0;
    }
}