class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean found = true;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        while (found) {
            found = set.contains(original);
            original *= 2;
        }
        
        return original / 2;
    }
}