class Solution {
    public int minimumOperations(int[] nums) {
        // Hint3: The answer is the number of unique non-zero numbers in nums
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (num != 0) {
                set.add(num);
            }
        }
        
        return set.size();
    }
}