class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int element : nums) {
            set.add(element);
        }
        
        for (int i = 1; i <= n; i++) {
            if (! set.contains(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
}