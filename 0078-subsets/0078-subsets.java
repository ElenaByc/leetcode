class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int idx = 0;
        calcSubset(nums, result, subset, idx);
        return result;
    }
    
    public void calcSubset(int[] nums, List<List<Integer>> result, List<Integer> subset, int idx) {
        result.add(new ArrayList<>(subset));

        for (int i = idx; i < nums.length; i++) {
            subset.add(nums[i]);
            calcSubset(nums, result, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

}